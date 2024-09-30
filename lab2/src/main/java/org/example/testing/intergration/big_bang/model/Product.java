package org.example.testing.intergration.big_bang.model;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Product {
    private int id;
    private String name;
    private double price;
    private int quantity;

}
