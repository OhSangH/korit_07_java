package com.ch21_json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

public class JSON1 {
    public static void main(String[] args) {
        JsonObject jsonObject1 = new JsonObject();
        // 속성(키 - 값 쌍)을 추가하는 메서드 -> addProperty() 메서드

        jsonObject1.addProperty("username", 1);
        jsonObject1.addProperty("userpassword", 1234);
        jsonObject1.addProperty("email", "a@test.com");
        jsonObject1.addProperty("name", "김일");
        jsonObject1.addProperty("score", 4.5);

        System.out.println(jsonObject1);
        // 평범하게 출력하면 사람이 읽기에는 부적합한 형태로 출력된다.
        // 이를 수정하여 사람이 읽기 편하게 하는 방식을 Pretty printing 이라고 한다.

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String jsonData = gson.toJson(jsonObject1);
        System.out.println(jsonData);
        // 이 방식으로 수정하면 사람이 읽기 편한 방식으로 수정이 가능하다.


    }
}
