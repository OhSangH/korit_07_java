package com.ch08_methods;

public class Overloading {
    public static void add() {
        System.out.println("add()");
    }

    //Overloading 적용
    //call2() 유형 작성 #1
    public static void add(String s) {
        System.out.println("add(String s)");
        System.out.println(s);
    }

    //call2() 유형 작성 #2
    public static void add(int a, int b) {
        System.out.println("add(int a, int b)"); // 이 문장에 사용되는 print
        System.out.println(a + b);               // 이 문장에 사용되는 print 서로 overloading 중이다.
    }

    public static void add(int a, String s) {
        System.out.println("add(int a, String s)");
        System.out.println(a + " / " + s);
    }

    public static void add(int a, int b, double c) {
        System.out.println("add(int a, int b, double c)");
        System.out.println("a + b + c = " + (a + b + c));
    }

    public static void main(String[] args) {
        add();
        add("a");
        add(1, 2);
        add(8, "월 1일");
        add(1, 2, 4.5);
    }
}
