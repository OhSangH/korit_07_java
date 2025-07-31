package com.ch07_loops;

import java.util.Scanner;

public class Loop05 {
    public static void main(String[] args) {
        /*
            중첩 for 사용가능
            for ( int i = 0 ; i < 100 ; i++){
                반복실행문1-a
                for ( int j = 0 ; j < 100 ; j++){
                    반복실행문2
                }
                반복실행문1-b
            }

            for 이용하여 1일차 1교시 ~ 5일차 3교시입니다. 출력
         */
//        for (int i = 1; i <= 5 ; i++){
//            for (int j = 1; j <= 3; j++){
//                System.out.println(i + "일차 " + j + "교시 입니다.");
//            }
//        }
//        for (int i = 1; i <= 9 ; i++){
//            for (int j = 1; j <= 9; j++){
//                System.out.println(i + " X " + j + " = " + (i * j));
//            }
//        }

        /*
         1 2 ... 10
         11 12 ... 20
         ...
         91 92 ... 100
         */
//        for (int i = 1; i < 101; i++) {
//            System.out.print(i + " ");
//            if (i % 10 == 0) System.out.println();
//        }
//        for (int i = 0; i < 10; i++) {
//            System.out.print(((i * 10) + 1) + " "
//                    + ((i * 10) + 2) + " "
//                    + ((i * 10) + 3) + " "
//                    + ((i * 10) + 4) + " "
//                    + ((i * 10) + 5) + " "
//                    + ((i * 10) + 6) + " "
//                    + ((i * 10) + 7) + " "
//                    + ((i * 10) + 8) + " "
//                    + ((i * 10) + 9) + " "
//                    + ((i * 10) + 10) + " ");
//            System.out.println();
//        }
        /*
            숫자를 입력받아 1 ~ n 합 (for 문으로)
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력해 주세요 >>> ");
        int n = sc.nextInt();
        int sum = 0;
        int sum2 = 0;
        int sum3 = 0;
        for (int i = 1; i < n + 1; i++) {
            sum += i;
            if (i % 2 == 0) {
                sum2 += i;
            }
        }
        sum3 += sum - sum2;
        System.out.println("1 ~ n 까지의 합: " + sum);
        System.out.println("1 ~ n 까지의 짝수의 합: " + sum2);
        System.out.println("1 ~ n 까지의 홀수의 합: " + sum3);

    }
}
