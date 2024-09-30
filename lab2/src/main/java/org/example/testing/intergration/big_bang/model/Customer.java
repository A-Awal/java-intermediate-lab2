package org.example.testing.intergration.big_bang.model;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;

@Data
@Builder
public class Customer {
    private int id;
    private String name;
    private String email;
    private Collection<Purchases> purchases;


}
