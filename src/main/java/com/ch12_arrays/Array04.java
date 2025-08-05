package com.ch12_arrays;

/*
    main에서 사용하는 불특정 String[] 배열을 argument로 하는 메서드를 호출 했을때
    String[] 내부에 element들을 한줄로 출력하는 method를 정의 하는것
 */
/*
    String[]의 element들의 값을 하나하나 다 입력받아 바꾸는 메서드
 */

import java.util.Scanner;

public class Array04 {
    private static Scanner sc = new Scanner(System.in);

    public static void printElement() {
        String[] names = {"김일", "김이", "김삼", "김사", "김오", "김육"};
        for (String arr : names) {
            System.out.print(arr + " ");
        }
        System.out.println();
    }

    public static void printElement(String[] arrays) {
        for (String arr : arrays) {
            System.out.print(arr + " ");
        }
        System.out.println();
    }

    public static void printElement(int[] arrays) {
        for (int arr : arrays) {
            System.out.print(arr + " ");

        }
        System.out.println();
    }

    public static void printElement(double[] arrays) {
        for (double arr : arrays) {
            System.out.print(arr + " ");

        }
        System.out.println();
    }

    public static void writesElement(String[] arrays) {
        for (int i = 0; i < arrays.length; i++) {
            System.out.print("변경 할 문자열을 입력해 주세요>>> ");
            arrays[i] = sc.nextLine();
        }
    }

    public static void writesElement(int[] arrays) {
        for (int i = 0; i < arrays.length; i++) {
            System.out.print("변경 할 정수를 입력해 주세요>>> ");
            arrays[i] = sc.nextInt();
            sc.nextLine();
        }
    }

    public static void writesElement(double[] arrays) {
        for (int i = 0; i < arrays.length; i++) {
            System.out.print("변경 할 실수를 입력해 주세요>>> ");
            arrays[i] = sc.nextDouble();
            sc.nextLine();
        }
    }

    public static void main(String[] args) {
        String[] student = {"이일", "이이", "이삼", "이사", "이오"};
        String[] teacher = {"안일", "안이", "안삼", "안사"};

//        printElement();
//        printElement(student);
//        printElement(teacher);

//        int[] date = {2025, 8, 5};
//        printElement(date);

        String[] people = new String[5];
        printElement(people);
        writesElement(people);
        printElement(people);

        double[] scores = new double[5];
        printElement(scores);
        writesElement(scores);
        printElement(scores);
    }
}
