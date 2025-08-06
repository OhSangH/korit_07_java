package com.ch12_arrays;


public class Array10EnhancedFor {
    public static void main(String[] args) {
        int[] nums = new int[200];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i + 1;
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        for (int num : nums) {
            System.out.print(num + " ");
            // 첫번째 반복 시 num에는 1이 대입되어있다.
            // 즉 num = 1; 이 된 상황
            // 그다음 반복으로 넘어가면 num = 2 가 된다
        }
        System.out.println();

        String[] names = {"김일", "김이", "김삼", "김사", "김오"};
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + " ");
        }

        System.out.println();
        for (String name : names) {
            System.out.print(name + " ");
        }

    }
}
