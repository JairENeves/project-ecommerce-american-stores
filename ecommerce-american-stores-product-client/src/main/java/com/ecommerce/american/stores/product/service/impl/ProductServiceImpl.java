package com.ecommerce.american.stores.product.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ecommerce.american.stores.product.model.Product;
import com.ecommerce.american.stores.product.repository.ProductRepository;
import com.ecommerce.american.stores.product.service.ProductService;
import com.ecommerce.american.stores.product.utils.ConstantsUtils;

/**
 * @author Jair Neves
 *
 */
@Service
public class ProductServiceImpl implements ProductService {

	/** Logger. */
	private static final Logger LOGGER = LoggerFactory.getLogger(ProductServiceImpl.class);
	
    @Autowired
    private ProductRepository productRepository;
    
    @Override
    public ResponseEntity<Object> findAll() {
    	ResponseEntity<Object> retorno = null;
		try {
			List<Product> lista = this.productRepository.findAll();
			if(!lista.isEmpty()) {
				retorno = ResponseEntity.ok().body(lista.stream().map(Product::toDTO).collect(Collectors.toList()));
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

	/*@Override
	public void deleteCustomer(long id) {
		this.customerRepository.deleteById(id);
	}

	@Override
	public CustomerResponseDTO updateCustomer(Long customerId, CustomerRequestDTO customerRequest) {
	    Optional<CustomerEntity> customer = customerRepository.findById(customerId);
	    
	    customer.ifPresent(action ->{
	    	action.setEmail(customerRequest.getEmail());
	    	action.setName(customerRequest.getName());
	    	action.setUsername(customerRequest.getUsername());
	    	action.setPassword(GenerateHashPasswordUtil.generateHash(customerRequest.getPassword()));
	    	action.setModifiedAt(new Timestamp(System.currentTimeMillis()));
	    });
	    LOGGER.info(ConstantsUtils.CADASTRO_REALIZADO_COM_SUCESSO);
	    return CustomerEntity.toDTO(customerRepository.save(customer.get()));
	}

	@Override
	public CustomerResponseDTO createCustomer(@Valid CustomerRequestDTO customerRequest) {
		CustomerEntity customer = CustomerEntity.fromDTOCreate(customerRequest);
	    return CustomerEntity.toDTO(customerRepository.save(customer));
	}*/

}
