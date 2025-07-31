package com.ch07_loops;

public class Loop02 {
    public static void main(String[] args) {
        /*
        1 2 ... 10
        11 12 ... 20
        ...
        91 ... 100
        결과값 내기
        1. 반복문 100번 돌리기
        2. 반복문 10번 돌리기
         */
        int i = 0;
        while (i < 100) {
            System.out.print(++i + " ");
            if (i % 10 == 0) System.out.println();
        }
//        int j = 0;
//        int k = 0;
//        while (j < 10) {
//            while (k < 10) {
//                System.out.print((10*j + ++k) + " ");
//            }
//            System.out.println();
//            ++j;
//            k = 0;
//        }
        int j = 0;
        while (j < 10) {
            System.out.print((j * 10) + " ");
            System.out.print((j * 10) + 1 + " ");
            System.out.print((j * 10) + 2 + " ");
            System.out.print((j * 10) + 3 + " ");
            System.out.print((j * 10) + 4 + " ");
            System.out.print((j * 10) + 6 + " ");
            System.out.print((j * 10) + 5 + " ");
            System.out.print((j * 10) + 7 + " ");
            System.out.print((j * 10) + 8 + " ");
            System.out.print((j * 10) + 9 + " ");
            System.out.println();
            j++;
        }
    }
}
