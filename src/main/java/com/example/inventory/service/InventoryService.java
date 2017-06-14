package com.example.inventory.service;

import com.example.inventory.entities.Product;


public interface InventoryService 
{
  public boolean isAVailable(String productCode);
  public Product saveProduct(Product product);
}
