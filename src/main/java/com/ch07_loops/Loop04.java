package com.ch07_loops;

import java.util.Scanner;

public class Loop04 {
    public static void main(String[] args) {
//        for (int i = 1; i < 101; i++) {
//            System.out.println(i);
//        }
//        int sum4 = 0;
//        for (int i = 0; i < 100; i++) {
//            sum4 += i + 1;
//        }
//        System.out.println(sum4);
        // 1 ~ 100 까지 홀수 합
//        int sum2 = 0;
//        for (int i = 0; i < 100; i++) {
//            if (i % 2 == 1) {
//                sum2 += i;
//            }
//        }
//        System.out.println(sum2);
//
//        int sum3 = 0;
//        for (int i = 0; i < 100; i += 2) {
//            sum3 += i + 1;
//        }
//        System.out.println(sum3);

        /*
            숫자를 입력받아 1 ~ n 더하는 반복문.
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력해 주세요 >>> ");
        int n = sc.nextInt();
        int sum4 = 0;
        for (int i = 1; i <= n; i++) {
            sum4 += i;
        }
        System.out.println("1부터 " + n + "까지의 합 : " + sum4);
    }
}
