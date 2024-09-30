package org.example.testing.intergration.bottom_up.web;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.testing.intergration.bottom_up.application.UserService;
import org.example.testing.intergration.bottom_up.model.User;
import org.example.testing.intergration.bottom_up.web.dto.UserDto;
import org.springframework.context.annotation.Profile;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@RestController
@Profile("bottomup")
@RequestMapping("/bottom-up")
public class UserController {
    private final UserService userService;
    private final ObjectMapper objectMapper;

    public UserController(UserService userService, ObjectMapper objectMapper) {
        this.userService = userService;
        this.objectMapper = objectMapper;
    }

    @RequestMapping(method = RequestMethod.POST, path = "/add")
    public ResponseEntity<String> addUser(@RequestBody UserDto userDto) {
        User user = objectMapper.convertValue(userDto, User.class);

        var saved = userService.save(user);

        URI uri = UriComponentsBuilder.fromPath("/bottom-up/get/{id}").buildAndExpand(saved.getId()).toUri();

        return ResponseEntity.created(uri).build();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/get")
    public ResponseEntity<User> getUsersById(@RequestParam Long id) {
        return ResponseEntity.ok( userService.findById(id));
    }
}
