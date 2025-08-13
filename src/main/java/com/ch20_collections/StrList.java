package com.ch20_collections;

import java.util.*;

public class StrList {
    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();
        String[] strArray = new String[5];
        // List는 Array랑 다르게 인덱스를 고정해줄 필요가 없다.

        strList.add("Java");
        strArray[0] = "김영";
        strArray[1] = "김일";
        strArray[2] = "김이";
        strArray[3] = "김삼";
        strArray[4] = "김사";
        // 내부 데이터를 집어 넣는데 List는 .add를 써야한다.
        strList.add("Python");
        strList.add("javascript");
        strList.add("C#");
        strList.add("C++");

        System.out.println(strArray);
        System.out.println(Arrays.toString(strArray));
        System.out.println(strList);


        // 특정 element(List 내외) 검색 -> contains() 메서드 사용 리스트명.contains(목적어)
        String searchElen1 = "Python";
        boolean contains1 = strList.contains(searchElen1);
        System.out.println(searchElen1 + " 포함여부 : " + contains1);
        String searchElen2 = "Py";
        boolean contains2 = strList.contains(searchElen2);
        System.out.println(searchElen2 + " 포함여부 : " + contains2);

        // 특정 element의 삭제
        String removeElen1 = "javascript";
        boolean isRemoved1 = strList.remove(removeElen1);
        System.out.println(removeElen1 + " 삭제 여부 : " + isRemoved1);
        // 시험에 pop() 메서드가 나온적 있어서 좀 비교 해야함
        // FIFO / .pop() -> 삭제 여부가 아닐 ㅏcollection에서 삭제하고 삭제된 element를 return해야함
        //

        System.out.println(strList + "\n 정렬 후");
        Collections.sort(strList); // sort사용시 유니코드 기반으로 정렬해서 대문자가 먼저온다.
        System.out.println(strList);

        System.out.println("역순 정렬");
        Collections.sort(strList, Collections.reverseOrder());
        System.out.println(strList);

        //전체 element를 출력하는 방법
        // Array
        for (int i = 0; i < strArray.length; i++) {
            System.out.print(strArray[i] + " ");
        }
        System.out.println();
        for (String str : strArray) {
            System.out.print(str + " ");
        }
        System.out.println();

        // List
        for (int i = 0; i < strList.size(); i++) {
            System.out.print(strList.get(i) + " ");
        }
        System.out.println();
        // 향상된 for문
        for (String str : strList) {
            System.out.print(str + " ");
        }


    }
}