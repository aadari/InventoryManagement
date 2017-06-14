package com.example.inventory.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.inventory.entities.Product;

@Repository
public interface ProductRepository extends MongoRepository<Product, String>
{
  public Product findProductByCode(String code);
}
