package com.example.Myapppication.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.Myapppication.model.Product;
import com.example.Myapppication.repository.ProductRepo;

@Service
public class ProductService {
//   List<Product> produList = new ArrayList<>(Arrays.asList(
//     new Product(100, "Iphone", 500000),
//     new Product(102, "oneplus", 40000),
//     new Product(103, "DELL", 7000000)
// ));
   
    @Autowired
    ProductRepo PR;


  public List<Product> get_product(){
    return PR.findAll();
  }
  public Product get_product(int productId) {

        return PR.findById(productId).orElse(null);
  }
  
  public void Add_product(Product prod){
    PR.save(prod);
  }
  public void Update_producting(Product prod) {
    PR.save(prod);
  }
  public void get_delete(int prod) {
      PR.deleteById(prod);

  }
}
