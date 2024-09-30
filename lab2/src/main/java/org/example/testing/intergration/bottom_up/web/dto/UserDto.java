package org.example.testing.intergration.bottom_up.web.dto;

import lombok.Data;

@Data
public class UserDto {
    private Long id;
    private String username;
    private String email;
    private String password;
    private String profilePicture;
    private String bio;
}
