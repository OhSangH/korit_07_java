package com.ch20_collections;

import java.util.*;

public class StrMap {
    public static void main(String[] args) {
        Map<String, String> strMap = new HashMap<>();

        // Map에 Key - Value 쌍(entry) 삽입 메서드 -> .put(키, 값);
        strMap.put("kor20250801", "김일");
        strMap.put("kor20250802", "김이");
        strMap.put("kor20250803", "김삼");
        strMap.put("kor20250804", "김사");
        strMap.put("kor20250805", "김오");
        // 입력한 순서대로 출력되지 않는다.

        System.out.println(strMap);
        // Key 하나당 Value는 하나입니다. 즉 키가 같다면 Value는 가장 최근걸로 덮어쓰기 됩니다.
        strMap.put("kor20250805", "KimFive");
        System.out.println(strMap);
        /*
            List의 경우에는 순사거 있기 때문에 기본적으로 index를 통한 조회가 가능합니다.
            하지만 Map의 경우 순서를 보장하지 않기 때문에 .get("키값"); 을 통해 조회할 수 있다,
         */
        Map<String, Double[]> koreanScores1 = new HashMap<>();
        koreanScores1.put("김일", new Double[]{98.2, 10.3});
        koreanScores1.put("김이", new Double[2]);

        Map<String, Double> koreanScores2 = new HashMap<>();
        koreanScores2.put("김일", 92.2);
        koreanScores2.put("김이", 92.2);
        koreanScores2.put("김삼", 93.2);
        koreanScores2.put("김사", 94.2);
        koreanScores2.put("김오", 95.2);


        // 특정 key의 value 수정
        // #1. 특정 Key값은 하나의 value값을 가지기 때문에 최근걸로 덮어 쓴다.
        System.out.println(koreanScores2);
        koreanScores2.put("김오", 4.5);
        System.out.println(koreanScores2);

        // # 2. .replace();
        koreanScores2.replace("김오", 123.123);
        System.out.println(koreanScores2);
        koreanScores2.replace("김육", 93.23);
        System.out.println(koreanScores2);
        /*
            두가지 방법이 있는데 이 방법중 .put은 없는 key값이라면 새로 생성하면서 수정을 하지만
            .replace()의 경우에는 key값이 없는경우 value값이 새로 생성되지 않는다.
            이때문에 Map의 Key값을 모두 알고 있는경우라면 .put()을 사용해도 상관 없지만,
            모르는 경우라면 .replace()를 사용하도록 하자.
         */

        // 특정 Key의 존재 여부
        boolean searchKeyFlag1 = strMap.containsKey("kor20250805");
        System.out.println("kor20250805 존재 여부 : " + searchKeyFlag1);

        // 특정 value의 존재 여부 -> .containsValue();
        boolean searchValueFlag1 = strMap.containsValue("김삼");
        System.out.println("김삼 존재 여부 : " + searchValueFlag1);

        // Map의 엔트리부터 Set을 생성
        Set<Map.Entry<String, String>> entrySet1 = new HashSet<>();
        // 이상의 코드는 Set을 하나 만드는데, 내부에 Key가 String, Value가 Sting인 Map이 통째로 들어갔다.
        Set<Map.Entry<String, String>> entrySet2 = strMap.entrySet();
        // strMap1의 key-value 쌍을 Set으로 바꾸는 메서드인
        // .entrySet()의 호출 결과를 entrySet2라는 변수에 담았다.
        System.out.println(strMap);
        System.out.println(entrySet2);
        System.out.println();

        List<Map.Entry<String, String>> entryList1 = new ArrayList<>();
//        List<Map.Entry<String, String>> entryList = strMap.entrySet();
        // Map -> List로 직접 변환이 불가능

        entryList1.addAll(entrySet2);
        System.out.println(entryList1); // list로 바뀌었으니까 element 추출이 가능하다.
        // .sort() 도 가능

        // Key Set 출력
        Set<String> keySet = strMap.keySet();
        System.out.println(keySet);

        //value Set 출력
//        Set<String> valueSet = strMap.values();
        // 이게 불가능한 이유는 key는 중복이 없어서 문제 없는데 value는 중복이 있어 원하는 값을 얻을수 없기 때문이다.

        Collection<String> values = strMap.values();
        System.out.println(values);


    }
}
