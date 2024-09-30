package org.example.testing.intergration.bottom_up.repository;

import org.example.testing.intergration.bottom_up.model.Comment;
import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Profile("bottomup")
public interface CommentRepository extends JpaRepository<Comment, Long> {
}
