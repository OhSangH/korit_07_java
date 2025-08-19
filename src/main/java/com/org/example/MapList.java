package com.org.example;

import java.util.*;

public class MapList {
    public static void main(String[] args) {
        List<Map<String, Object>> costumers = new ArrayList<Map<String, Object>>();
        Map<String, Object> costumersMap1 = new HashMap<String, Object>();
        costumersMap1.put("name", "홍길동");
        costumersMap1.put("rating", "vip");
        costumersMap1.put("age", 30);

        Map<String, Object> costumersMap2 = new HashMap<String, Object>();
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
