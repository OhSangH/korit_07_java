package com.ch12_arrays;

/*
    메서드 나 메인 어디에서도 작성해도 상관 없음
    String[] score 배열에
    A / B / C / D / E / F element를 입력하고
    예
    A+ B+ C+ D+ F
    가 되도록 코드를 작성하시오.
 */
public class Array05 {

    public static void printElement(String[] arrays) {
        for (String arr : arrays) {
            if (arr.equals("F")){
                System.out.print(arr + " ");
            } else if (arr.equals("E")) {
                System.out.print("");
            } else {
                System.out.print(arr + "+ ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String[] score= {"A", "B", "C", "D", "E", "F"};
        printElement(score);
    }
}
