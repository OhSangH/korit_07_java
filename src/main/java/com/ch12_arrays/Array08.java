package com.ch12_arrays;

public class Array08 {
    public int calcSum(int[] scores){
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        return sum;
    }
    public double calcAvg(int[] scores){
        return (double)calcSum(scores) / scores.length;
    }

    public static void main(String[] args) {
        Array08 array08 = new Array08();
        int[] scores = {100, 97, 55, 24, 49, 60, 20, 77, 89};

        // 위 배열을 매게변수로 총합 구하는 calcSum/ 평균 구하는 calcAVG call4()유형
        System.out.println("총합 : " + array08.calcSum(scores) + "점");
        System.out.printf("평균 : %.2f점" ,array08.calcAvg(scores) );
    }
}
