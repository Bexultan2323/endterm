package com.example.products.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Products")
public class Products {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private long product_id;
     private long category_id;
     private String product_name;
     private float product_price;
     private String description;
     private String production_date;
     private String expiry_date;
     private String barcode;
     private String weight;
}
