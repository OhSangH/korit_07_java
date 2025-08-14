package com.ch21_json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.*;

import com.google.gson.JsonObject;
import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
class User {
    private String username;
    private String password;
    private String email;
    private String name;
    private String age;
}

public class JSON2 {

    public static void main(String[] args) {
        Gson gson = new Gson();
        Gson gsonBuilder = new GsonBuilder().setPrettyPrinting().create();
        // 출력방식을 2개로 나눠서 진행할 예정

        // 1. Java Object -> json으로 변환
        // kim1 / 9876 / a@test.com / 김일 / 20 의 필드
        // JSON1.java 파일을 참조하여 json 데이터로 변환
        User user1 = new User("kim1", "8976", "a@test.com", "김일", "20");
        String jsonUser1 = gson.toJson(user1);
        String jsonUser2 = gsonBuilder.toJson(user1);
        System.out.println(jsonUser1);
        System.out.println(jsonUser2);


        /*
            2. Map -> json
            userMap1을 생성
            "productCode", "MyWY3KH/A"
            "productName", "아이폰 16 프로 맥스"

            Map ket-value entry
            json으로 1 대 1 대응 가능
            변경은 배우지 않았기 때문에 객체만 생성
         */

        Map<String, String> productMap1 = new HashMap<>();
        productMap1.put("productCode", "MYWY3KH/A");
        productMap1.put("productName", "아이폰 16 프로 맥스");

        String jsonProduct1 = gson.toJson(productMap1);
        String jsonProduct2 = gsonBuilder.toJson(productMap1);
        System.out.println(jsonProduct1);
        System.out.println(jsonProduct2);

        /*
            jsonUser2를 user 2로 바꾸고
            jsonProduct2를 productMap2로 바꾸기

            형식:
            gson.fromJson(Json데이터, 바꾸고자하는 클래스명.class)
         */
        User user2 = gson.fromJson(jsonUser2, User.class);
        System.out.println(user2);
        Map<String, String> productMap2 = gson.fromJson(jsonProduct2, Map.class);
        System.out.println(productMap2);

        Map<String, String> userMap1 = gson.fromJson(jsonUser2, Map.class);
        System.out.println(userMap1);

        /*
            json -> jsonObject로 수정

         */
        JsonObject jsonObject1 = gson.fromJson(jsonUser1, JsonObject.class);
        System.out.println(jsonObject1);
        JsonObject jsonObject2 = gsonBuilder.fromJson(jsonUser1, JsonObject.class);
        System.out.println(jsonObject2);

    }
}
