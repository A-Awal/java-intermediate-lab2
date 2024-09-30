package org.example.testing.intergration.topdown.model;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private int id;
    private String title;
    private String author;
    private Long quantity;

    @OneToMany(mappedBy = "book")
    private List<Borrowing> borrowing;
    public Book() {}

}
