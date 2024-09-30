package org.example.testing.intergration.topdown.model;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.util.Collection;

@Data
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private int age;

    @OneToMany(mappedBy = "student")
    private Collection<Borrowing> borrowing;


}
