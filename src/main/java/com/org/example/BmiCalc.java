package com.org.example;

import java.util.Scanner;

        /*
            BMI 계산식 체중 / 키^2
            실행 예
            이름을 입력하세요 >>> 김일
            키  >>> 172
            몸무게 >>> 68
            김일 님의 BMI 지수는 23.0으로 과체중입니다.
         */

public class BmiCalc {
    private String name;
    private double height;
    private double weight;

    public BmiCalc(){
        Scanner sc = new Scanner(System.in);
        System.out.print("이름 입력하세요 >>>");
        this.name = sc.nextLine();
        System.out.print("키(cm)를 입력하세요 >>>");
        this.height = sc.nextDouble();
        System.out.print("몸무게(Kg)를 입력하세요 >>>");
        this.weight = sc.nextDouble();
    }

    public void calcBMI() {
        calcBMI(name, height, weight);
    }

    public double calcBMI(double height, double weight) {
        double bmi;
        height = height / 100;
        bmi = weight / (height * height);
        return bmi;
    }

    public void calcBMI(String name, double height, double weight) {
        double bmi = calcBMI(height, weight);
        String bmiResult = name + "님의 BMI지수는 " + bmi + "으로 " + bmiResult(bmi) + "입니다.";
        System.out.println(bmiResult);

    }

    public String bmiResult(double bmi) {
        if (bmi < 18.5) {
            return "저체중";
        } else if (bmi < 23) {
            return "정상";
        } else if (bmi < 25) {
            return "과체중";
        } else if (bmi < 30) {
            return "1단계 비만";
        } else if (bmi < 35) {
            return "2단계 비만";
        } else {
            return "고도비만";
        }
    }

    public void calcBmi(Person person) {
        calcBMI(person.getName(), person.getHeight(), person.getWeight());
    }

    public static void main(String[] args) {

        BmiCalc bmiCalc = new BmiCalc();
        bmiCalc.calcBMI();

        Person person1 = Person.builder()
                .name("김이")
                .height(172)
                .weight(68)
                .build();


        bmiCalc.calcBmi(person1);

    }

}

