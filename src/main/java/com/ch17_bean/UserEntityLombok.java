package com.ch17_bean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
// 여기에 어노테이션을 달면 class level
public class UserEntityLombok {
    // 여기에 어노테이션을 달면 filed level
    private int username;
    @ToString.Exclude
    private int password;
    private String email;
    private String name;
}
