package com.ch12_arrays;

public class Array11 {
    public static void main(String[] args) {
        String[] persons = {"김일", "김이", "김삼", "김사", "김오"};
        /*
            1번 : 김일
            2번 : 김이
            ...
            5번 : 김오
         */
        int cnt = 0;
        for (int i = 0; i < persons.length; i++) {
            System.out.println(i + "번 : " + persons[i]);
        }
        System.out.println();
        for (String person : persons) {
            cnt++;
            System.out.println(cnt + "번 : " + person);
        }

    }
}
