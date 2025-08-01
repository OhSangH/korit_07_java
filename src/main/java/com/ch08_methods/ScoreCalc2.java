package com.ch08_methods;

import java.util.Scanner;

public class ScoreCalc2 {
    public static void calcSumAndAvg(){
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        double avg = 0;
        int numOfSubs = 0;
        // 3 과목의 점수를 입력 받아서, 총합과 평균 점수를 콘솔에 출력
        System.out.print("몇 과목의 점수를 입력하시겠습니까? >>> ");
        numOfSubs = sc.nextInt();
        for (int i = 1; i <= numOfSubs; i++) {
            System.out.print(i + " 과목의 점수를 입력하세요 >>> ");
            sum += sc.nextDouble();
        }
        avg = sum / numOfSubs;
        System.out.println("총합은 " + sum + "이며, 평균은 " + avg + "입니다.");
    }

    public static void main(String[] args) {
        calcSumAndAvg();
    }
}
