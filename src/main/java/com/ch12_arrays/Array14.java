package com.ch12_arrays;

import java.util.Arrays;

public class Array14 {
    public static void main(String[] args) {
        int[][] nums = new int[20][5];
        int cnt = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j] = (i * 5 + 1) + j; //++cnt
            }
        }
        for (int[] firstNums : nums) {
            System.out.print("[");
            for (int num : firstNums) {
                if (num % 5 == 0) {
                    System.out.print(num + "");
                } else {
                    System.out.print(num + ", ");
                }
            }
            System.out.println("]");
        }

        // 2차 배열의 출력
        System.out.println(Arrays.deepToString(nums));
    }
}
