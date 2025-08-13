package com.ch19_generic;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class ResponseData<T> {
    private String message;
    private T data;

}
/*
    제네릭을 사용할려면 class에 추가적인 명령어가 필요하다.
    클래스 명 뒤에 <T>를 추가해 줘야 한다.
 */