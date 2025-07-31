package com.ch07_loops;

public class Loop06 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - i; j++) {
                System.out.print("⭐");
            }
            System.out.println();
        }
//        // 100 ~ 1 까지 역순 출력
//        for (int i = 100; i > 0; i--) {
//            System.out.println(i);
//        }
    }

}
