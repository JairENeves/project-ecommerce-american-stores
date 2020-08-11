package com.ecommerce.american.stores.product.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.american.stores.product.service.ProductService;
import com.ecommerce.american.stores.product.utils.ConstantsUtils;

import io.swagger.annotations.ApiOperation;

@RestController
@CrossOrigin
@RequestMapping(path = "/product", produces = MediaType.APPLICATION_JSON_VALUE)
public class ProductController {

	/** Logger. */
	private static final Logger LOGGER = LoggerFactory.getLogger(ProductController.class);
	
    @Autowired
    private ProductService productService;

    @GetMapping("/findAll")
    @ApiOperation(value = ConstantsUtils.RECUPERAR_TODAS_AS_PESSOAS)
    public ResponseEntity<Object> findAll() {
    	LOGGER.info(ConstantsUtils.RECUPERAR_TODAS_AS_PESSOAS);
        return this.productService.findAll();
    }
    
}