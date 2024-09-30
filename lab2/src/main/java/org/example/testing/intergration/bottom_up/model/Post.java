package org.example.testing.intergration.bottom_up.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne()
    @JoinColumn(name = "user_id")
    private User user;
    private String content;
    private LocalDateTime createdAt;
    private int likes;

    @OneToMany(mappedBy = "post")
    private List<Comment> comments = new ArrayList<>();

    // Getters, setters, constructors, and other methods
}
