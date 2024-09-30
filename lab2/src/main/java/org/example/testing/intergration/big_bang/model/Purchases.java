package org.example.testing.intergration.big_bang.model;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

//import java.sql.Date;
import java.util.Date;

@Data
public class Purchases {
    private int id;
    private Date purchaseDate= new Date();
    private int quantity;
    private Customer customer;
    private Product product;

}
