package com.example.Myapppication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Myapppication.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product,Integer> 
{

}
