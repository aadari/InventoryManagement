package com.example.inventory.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.inventory.entities.Product;
import com.example.inventory.repository.ProductRepository;
import com.example.inventory.service.InventoryService;

@Service
public class InventoryServiceImpl implements InventoryService
{
 
	@Autowired 	private ProductRepository productRepository;
	
	@Override 	public boolean isAVailable(String productCode)
	{
		
		return productRepository.findProductByCode(productCode).getQuantity() > 0 ? true : false;
	}
	
	@Override public Product saveProduct(Product product)
	{
		return productRepository.save(product);
	}
 
}
