package org.example.testing.intergration.bottom_up.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "Users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String username;
    private String email;
    private String password;
    private String profilePicture;
    private String bio;

    @ManyToMany()
    private List<User> followers = new ArrayList<>();


    @ManyToMany(mappedBy = "followers")
    private List<User> following = new ArrayList<>();

    @OneToMany(mappedBy = "user")
    private List<Post> posts = new ArrayList<>();


    // Getters, setters, constructors, and other methods
}
