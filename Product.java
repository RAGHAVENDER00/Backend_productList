package com.example.Myapppication.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
public class Product {

  @Id
  private int product_id;
  private String Product_name;
  private int Price;

  
}
