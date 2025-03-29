package com.example.Myapppication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Myapppication.model.Product;
import com.example.Myapppication.service.ProductService;

@RestController
public class ProductController {
  
  @Autowired
  ProductService ps;

  @RequestMapping("/product")
  public List<Product> getProduct(){
    return ps.get_product();
  }

  @RequestMapping("/product/{productId}")
  public Product geProduct_id(@PathVariable int productId){
      
    return ps.get_product(productId);
    
  }

  @PostMapping("/product")
  public void Adding_product(@RequestBody Product prod){
      
    ps.Add_product(prod);
    
  }

  @PutMapping("/product")
  public void Update_product(@RequestBody Product prod){
      
    ps.Update_producting(prod);
  }
  @DeleteMapping("/product/{productId}")
  public void delet_id(@PathVariable int productId){
      
    ps.get_delete(productId);
    
  }
  
}
