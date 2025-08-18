package com.ch20_collections;

import java.util.*;

/*
    List는 순서가 있고 중복을 허용하는 반면,
    Set의 경우 순서는 없고 중복은허용하지 않기 때문에
    List -> Set / 혹은 Set -> List로의 형변환이 중요하다
    예를 들어 List로 설문을 받고 Set을 통해 중복을 제거하면
    특정 후보군만 남기는 것이 가능해진다.
    또한 Set으로 중복을 제거한 후 다시 List로 돌려 조회도 가능하게 한다.
    단 Set은 순서가 없다.


 */
public class StrSet {
    public static void main(String[] args) {
        // Set 객체 생성
        Set<String> strSet = new HashSet<>();
        // List 객체도 생성
        List<String> strList = new ArrayList<>();

        // List / Set에 element 추가하는 방법은 동일하다.
        strList.add("java");
        strList.add("java");
        strList.add("java");
        strList.add("python");
        strList.add("python");
        strList.add("React");
        strList.add("React");
        strList.add("React");
        strList.add("React");
        strList.add("React");
        strList.add("React");
        System.out.println(strList);

        strSet.add("TypeScript");
        System.out.println(strSet);
//        strList.addAll(strSet);
        strSet.addAll(strList);
        System.out.println(strList);
        System.out.println(strSet);

        // Set을 사용할 경우 size() 메서드를 사용해 사이즈는 알 수 있어도 인덱스는 없어서 특정 하나의 값을 불러오기가 어렵다.
        // 그래서 Set에서 List로 형변환도 자주 일어난다.

        List<String> modifiedStrList = new ArrayList<>();
        modifiedStrList.addAll(strSet);

        System.out.println(modifiedStrList);
        Collections.sort(modifiedStrList);
        System.out.println(modifiedStrList);

        /*
            실행 예
            React 언어
            TypeScript 언어
            Java 언어
            Python 언어

            일반 for문 / 향상된 for문
         */

        for (int i = 0; i < modifiedStrList.size(); i++) {
            System.out.println(modifiedStrList.get(i) + " 언어");
        }
        System.out.println();
        for (String str : modifiedStrList) {
            System.out.println(str + " 언어 향상된 for문");
        }
    }
}
/*
    5명의 학생이 있다.
    "제주", "제주", " 민속촌", "민속촌", "제주"
    출력
    제주
    제주
    민속촌
    민속촌
    제주

    제주
    민속촌
 */