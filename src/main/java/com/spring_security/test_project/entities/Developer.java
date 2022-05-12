package com.spring_security.test_project.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Developer {
    private Long id;
    private String lastName;
    private String firstName;
}
