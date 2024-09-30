package org.example.testing.intergration.bottom_up.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Entity
@Data
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne()
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne()
    @JoinColumn(name = "post_id")
    private Post post;

    private String content;
    private LocalDateTime createdAt;

    // Getters, setters, constructors, and other methods
}
