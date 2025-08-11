package com.ch18_static;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {
    private String name;
    @Getter
    private static int count = 0;

}
