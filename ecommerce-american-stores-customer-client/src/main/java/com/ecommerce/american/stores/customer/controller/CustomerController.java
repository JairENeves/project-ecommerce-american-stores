package com.ecommerce.american.stores.customer.controller;

import java.net.URI;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.ecommerce.american.stores.customer.model.dto.CustomerRequest;
import com.ecommerce.american.stores.customer.model.dto.CustomerResponse;
import com.ecommerce.american.stores.customer.service.CustomerService;

import io.swagger.annotations.ApiOperation;

@RestController
@CrossOrigin
@RequestMapping(path = "/customer", produces = MediaType.APPLICATION_JSON_VALUE)
public class CustomerController {

	/** Logger. */
	private static final Logger LOGGER = LoggerFactory.getLogger(CustomerController.class);
	
    @Autowired
    private CustomerService customerService;

    @GetMapping("/findAll")
    @ApiOperation(value = "Consult all customers")
    public ResponseEntity<Object> findAll() {
    	LOGGER.info("Consult all customers");
        return this.customerService.findAll();
    }
    
    /**
     * Method responsible for creating a Customer.
     *
     * @param Customer information that is to be creadted.
     * @return RespondeEntity containing the URI and equivalent CustomerResponseDTO object.
     */
    @PostMapping
    @ApiOperation(value = "Create a Customer")
    public ResponseEntity<CustomerResponse> createCustomer(
        @RequestBody @Valid CustomerRequest CustomerRequest) {
    	CustomerResponse saveCustomer = customerService.createCustomer(CustomerRequest);
      URI locationResource =
          ServletUriComponentsBuilder.fromCurrentRequest()
              .path("/{id}")
              .buildAndExpand(saveCustomer.getCustomerId())
              .toUri();
      LOGGER.info("Successfully created Customer with ID " + saveCustomer.getCustomerId());
      return ResponseEntity.created(locationResource).body(saveCustomer);
    }
    
    /**
     * Method responsible for deleting a Customer.
     *
     * @param customerId that is to be deleted.
     * @return ResponseEntity with no content.
     */
    @ApiOperation(value = "Delete a Customer")
    @DeleteMapping("/{customerId}")
    public ResponseEntity<Object> deleteCustomer(@PathVariable long id) {
    	this.customerService.deleteCustomer(id);
      LOGGER.info("Successfully deleted Customer with ID " + id);
      return ResponseEntity.noContent().build();
    }
    
    /**
     * Method responsible for updating a Customer.
     *
     * @param customerId that is to be updated.
     * @param Customer information that is to be updated.
     * @return ResponseEntity containing the updated CustomerResponseDTO object.
     */
    @PutMapping("/{customerId}")
    @ApiOperation(value = "Update a Customer")
    public ResponseEntity<CustomerResponse> updateCustomer(@PathVariable Long customerId, @RequestBody CustomerRequest customerRequest) {
    	CustomerResponse customerUpdate = this.customerService.updateCustomer(customerId, customerRequest);
      LOGGER.info("Successfully updated Customer with ID " + customerId);
      return ResponseEntity.ok(customerUpdate);
    }
    
}