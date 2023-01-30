package com.example.wstutorial.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Employee {
    private int id;
    private String firstName;
}
