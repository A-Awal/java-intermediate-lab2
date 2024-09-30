package org.example.testing.intergration.bottom_up.application;

import org.example.testing.intergration.bottom_up.model.User;
import org.example.testing.intergration.bottom_up.repository.UserRepository;
import org.example.testing.intergration.common.JpaBaseService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("bottomup")
public class UserService extends JpaBaseService<User, Long> {
    public UserService(UserRepository repository) {
        super(repository);
    }
}
