package com.org.example;

import java.util.*;

public class MapList {
    public static void main(String[] args) {
        List<Map<String, Object>> costumers = new ArrayList<>();
        // 처음 Generic이 도입됬을 때는 선언할 때 선언문 및 생성자 둘다 타입을 명시 해 줘야 됬다.
        Map<String, Object> costumersMap1 = new HashMap<>();
        costumersMap1.put("name", "홍길동");
        costumersMap1.put("rating", "vip");
        costumersMap1.put("age", 30);

        Map<String, Object> costumersMap2 = new HashMap<>();
        costumersMap2.put("name", "김기영");
        costumersMap2.put("rating", "gold");
        costumersMap2.put("age", 35);

        costumers.add(costumersMap1);
        costumers.add(costumersMap2);


        for (Map<String, Object> costumer : costumers) {
            List<Map.Entry<String, Object>> costumerEntry = new ArrayList<>(costumer.entrySet());
            for (Map.Entry<String, Object> profile : costumerEntry) {
                System.out.println(profile);
            }
        }

    }
}
