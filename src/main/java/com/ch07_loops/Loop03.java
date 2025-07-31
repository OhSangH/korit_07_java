package com.ch07_loops;

/*
    중첩 while문

 */
public class Loop03 {
    public static void main(String[] args) {
/*
        int day = 0;
        // 1일차 1교시... ~ 1일차 3교시입니다.
        // 2일차 1교시... ~ 2일차 3교시입니다.
        // ...
        // 5일차 1교시... ~ 5일차 3교시입니다.
        while (day < 5) {
            ++day;
            int lesson = 0; //scope(범위)라는 것으로, 전역변수, 지역변수라 한다.
            while (lesson < 3) {
                ++lesson;
                System.out.println(day + "일차" + lesson + "교시 입니다. ");
            }
        }
*/

        /*
        2 X 1 = 2
        2 X 2 = 4
        ...
        9 X 9 = 81
         */
        int dan = 2;
        while (dan < 10) {
            int i = 1;
            while (i < 10) {
                System.out.println(dan + " X " + i + " = " + (dan * i));
                i++;
            }
            dan++;
        }


    }
}
