package org.example.testing.intergration.bottom_up.application;

import org.example.testing.intergration.bottom_up.model.Comment;
import org.example.testing.intergration.bottom_up.repository.CommentRepository;
import org.example.testing.intergration.common.JpaBaseService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("bottomup")
public class CommentService extends JpaBaseService<Comment, Long> {
    public CommentService(CommentRepository repository) {
        super(repository);
    }
}
