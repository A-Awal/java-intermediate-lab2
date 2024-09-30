package org.example.spring_mvc.ex2;

import lombok.Data;

import java.io.Serializable;

@Data
public class Student implements Serializable {
    private String name;
    private String School;
}
