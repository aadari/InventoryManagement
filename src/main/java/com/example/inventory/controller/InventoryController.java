package com.example.inventory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.inventory.entities.Product;
import com.example.inventory.service.InventoryService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/inventoryManagement")
public class InventoryController 
{
	@Autowired
	InventoryService inventoryService;
	
    @RequestMapping(value = "/product", method = RequestMethod.POST, produces = "application/json")
    @ApiOperation(value="adding products to inventory")
	public Product addProduct(@RequestBody Product product)
	{
    	return inventoryService.saveProduct(product);
	}
    
    @RequestMapping(value = "/findAvailability/{productCode}", method = RequestMethod.GET, produces = "application/json")
    @ApiOperation(value="using productcode to find availability of products in stock")
    public Boolean findAvailability(@PathVariable(value = "productCode") String productCode)
    {
    	return inventoryService.isAVailable(productCode);
    }
}
