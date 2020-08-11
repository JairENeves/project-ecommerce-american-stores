package com.ecommerce.american.stores.customer.service.impl;

import java.sql.Timestamp;
import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ecommerce.american.stores.customer.model.Customer;
import com.ecommerce.american.stores.customer.model.User;
import com.ecommerce.american.stores.customer.model.dto.CustomerRequest;
import com.ecommerce.american.stores.customer.model.dto.CustomerResponse;
import com.ecommerce.american.stores.customer.repository.CustomerRepository;
import com.ecommerce.american.stores.customer.service.CustomerService;
import com.ecommerce.american.stores.customer.utils.ConstantsUtils;

/**
 * @author Jair Neves
 *
 */
@Service
public class CustomerServiceImpl implements CustomerService {

	/** Logger. */
	private static final Logger LOGGER = LoggerFactory.getLogger(CustomerServiceImpl.class);
	
    @Autowired
    private CustomerRepository customerRepository;
    
    @Override
    public ResponseEntity<Object> findAll() {
    	ResponseEntity<Object> retorno = null;
		try {
			List<Customer> lista = this.customerRepository.findAll();
			if(!lista.isEmpty()) {
				retorno = ResponseEntity.ok().body(lista.stream().map(Customer::toDTO).collect(Collectors.toList()));
			}else {
				retorno = ResponseEntity.ok().body(ConstantsUtils.DADOS_NAO_ENCONTRADO);
			}
		}catch (Exception e) {
			LOGGER.error(ConstantsUtils.OCORREU_UM_ERRO_NA_CONSULTA, e.getMessage());
			return new ResponseEntity<>(ConstantsUtils.OCORREU_UM_ERRO_NA_CONSULTA, HttpStatus.BAD_REQUEST);
		}
		LOGGER.info(ConstantsUtils.CONSULTA_REALIZADO_COM_SUCESSO);
        return ResponseEntity.ok().body(retorno);
    }

	@Override
	public void deleteCustomer(long id) {
		this.customerRepository.delete(id);
	}

	@Override
	public CustomerResponse updateCustomer(Long customerId, CustomerRequest customerRequest) {
	    Customer customer = customerRepository.findOne(customerId);
	    
	    if(customer != null) {
	    	customer.setEmail(customerRequest.getEmail());
	    	customer.setName(customerRequest.getName());
	    	customer.setUser(new User(customerRequest.getUsername()));
	    	customer.setModifiedAt(new Timestamp(System.currentTimeMillis()));
	    }
	    LOGGER.info(ConstantsUtils.CADASTRO_REALIZADO_COM_SUCESSO);
	    return Customer.toDTO(customerRepository.save(customer));
	}

	@Override
	public CustomerResponse createCustomer(@Valid CustomerRequest customerRequest) {
		Customer customer = Customer.fromDTOCreate(customerRequest);
	    return Customer.toDTO(customerRepository.save(customer));
	}

}
