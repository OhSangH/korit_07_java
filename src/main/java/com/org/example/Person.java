package com.org.example;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Person {
    private String name;
    private double weight;
    private double height;
}
