package com.ch05_conversion;

public class Main {
    public static void main(String[] args) {
        char cast1 = 'A';
        System.out.println("원형 : " + cast1);
        System.out.println("변형 : " + (int) cast1);
        // A 는 int로 형 변환 시 65

        char cast2 = 'a';
        System.out.println("원형 : " + cast2);
        System.out.println("변형 : " + (int) cast2);

        char cast3 = 'b';
        int casted3 = cast3;
        // 변수를 선언할 때의 자료형이 변환되기를 원하는 자료형으로 명시
        System.out.println("원형 : " + cast3);
        System.out.println("변형 : " + casted3);


        int cast4 = 99; // #1 으로 다운캐스팅
        int cast5 = 100; // #2 으로 다운캐스팅

        System.out.println("원형 : " + cast4);
        System.out.println("변형 : " + (char) cast4);

//        char casted5 = cast5;
        /*
            데이터 형 변환 시 Upcasting의 경우 메모리 용량이 커지면 되니깐
            기존 데이터가 변형이 일어날 가능성이 없어서 암시적(으로 변형이
            가능한 반면, downcasting의 경우에는 데이터 용량이 축소되는
            과정에서 변수가 메모리 용량을 벗어나게 되는 경우가 있습니다.
            용량 오버에 해당하는 현상을 미리 점검하기 위해 다운캐스팅 시에는
            명시적(explicit)으로면 변형이 가능합니다.

            -> 현재는 기본 자료형을 기준으로 예시를 들었지만 나중에는
            참조자료형 캐스팅 개념과 연결 됩니다.
         */
        char casted5 = (char) cast5;
        System.out.println("원형 : " + cast5);
        System.out.println("변형 : " + casted5);

        /*
            정수 long의 경우 SQL 문에서는 bigint로 쓴다.
         */


    }
}
