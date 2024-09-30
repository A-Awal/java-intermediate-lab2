package org.example.lab2.testing.integration.bottom_up;

import org.example.testing.intergration.bottom_up.model.User;
import org.example.testing.intergration.bottom_up.repository.UserRepository;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import java.util.Arrays;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


@DataJpaTest
public class User_Repo_Test {
    @Autowired
    UserRepository userRepository;

    @Autowired
    TestEntityManager entityManager;

    @Test
    @DisplayName("get user by Id")
    void testGetUser_returnsUserProfile(){
        User u1 = new User();
        u1.setBio("hansome");
        u1.setEmail("hansome@gmail.com");
        u1.setUsername("hansome");
        u1.setPassword("hansome");

        User u2 = new User();
        u2.setBio("motto");
        u2.setEmail("motto@gmail.com");
        u2.setUsername("motto");
        u2.setPassword("motto");

        Arrays.asList(u1, u2).forEach(entityManager::persistAndFlush);

        User user = userRepository.findById(1L).get();
        assertThat(user).isNotNull();
        assertThat(user.getBio()).isEqualTo("hansome");
    }

    @Test
    @DisplayName("Adding a follower")
    void testAddFollower(){
        User u1 = new User();
        u1.setBio("hansome");
        u1.setEmail("hansome@gmail.com");
        u1.setUsername("hansome");
        u1.setPassword("hansome");

        User u2 = new User();
        u2.setBio("motto");
        u2.setEmail("motto@gmail.com");
        u2.setUsername("motto");
        u2.setPassword("motto");

        Arrays.asList(u1, u2).forEach(entityManager::persistAndFlush);

        User following = entityManager.find(User.class, 3L);
        User follower = entityManager.find(User.class, 4L);

        following.setFollowers(Arrays.asList(follower));

        assertThat(following.getFollowers().stream().findFirst().get().getUsername()).isEqualTo("motto");

    }


}
