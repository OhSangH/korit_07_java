package com.ch12_arrays;

import java.util.Arrays;

/*
    다차원 배열 (Multi-Dimensional Array)
    배열중 다중 차원의 배열에 해당한다
 */
public class Array13 {
    public static void main(String[] args) {
        int[][] arr03 = {{1, 2}, {3, 4}, {5, 6}};

        System.out.println(arr03[2][0]);
        System.out.println(arr03[2]); // 결과값 : [I@36baf30c < '[' 대괄호 하나가 차원갯수를 알 수 있다.
        System.out.println(arr03); // 결과값 : [[I@7a81197d
        System.out.println(Arrays.toString(arr03)); // 결과값 : [[I@5ca881b5, [I@24d46ca6, [I@36baf30c]

        //2차 배열의 element 추출 -> 중첩 for문 사용
        for (int i = 0; i < arr03.length; i++) {
            for (int j = 0; j < arr03[i].length; j++) {
                System.out.print(arr03[i][j] + " ");
            }
            System.out.println();
        }

        // 향상된 for문 중첩 사용
        for (int[] arr : arr03) {
            for (int num : arr) {
                System.out.println(num);
            }
        }
    }
}
