package org.example.testing.intergration.bottom_up.application;

import org.example.testing.intergration.bottom_up.model.Post;
import org.example.testing.intergration.bottom_up.repository.PostRepository;
import org.example.testing.intergration.common.JpaBaseService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("bottomup")
public class PostService extends JpaBaseService<Post, Long> {
    public PostService(PostRepository repository) {
        super(repository);
    }
}
