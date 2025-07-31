package com.ch07_loops;

import java.util.Scanner;

public class Loop07 {
    /*
        몇 줄의 별을 생성 하시겠습까? >>> 3
        *
        **
        ***
        로 작성

        다하면 역순
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("몇 줄의 별을 생성 하시겠습까? >>> ");
        int row = sc.nextInt();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("⭐");
            }
            System.out.println();
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row - i; j++) {
                System.out.print("⭐");
            }
            System.out.println();
        }

    }
}
