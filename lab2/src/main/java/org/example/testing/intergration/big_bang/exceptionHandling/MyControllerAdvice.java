package org.example.testing.intergration.big_bang.exceptionHandling;

import org.springframework.context.annotation.Profile;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Component
@Profile("big_bang")
@RestControllerAdvice
public class MyControllerAdvice {

    @ExceptionHandler(ControllerException.class)
    public ResponseEntity<String> exceptionHandler(ControllerException e) {
        ResponseEntity<String> ans = new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        ans.hasBody();
        return ans;
    }
}
