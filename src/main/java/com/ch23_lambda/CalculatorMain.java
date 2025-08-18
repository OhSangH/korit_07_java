package com.ch23_lambda;

public class CalculatorMain {
    public static int operate(int a, int b , Calculator c){
        return c.calculate(a, b);
    }
    public static void main(String[] args) {
        // interface Calculator를 이용하여 사칙연산을 시도
        Calculator add = (x, y) -> x + y;
        Calculator sub = (x, y) -> x - y;
        Calculator mul = (x, y) -> x * y;
        Calculator div = (x, y) -> x / y;


        System.out.println(add.calculate(2, 3));
        System.out.println(sub.calculate(2, 3));
        System.out.println("--- static method 호출 방식 결과 ---");
        System.out.println("2 + 3" + operate(2, 3, add));
        // 18번 라인을 확인시 이해를 할려면 interface Calculator, CalculatorMain의 static 메서드
        // 그리 main문 안의 lambda식 을 모두 이해할 필요가 있다.
    }
}
