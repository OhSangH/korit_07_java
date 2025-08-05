package com.ch12_arrays;

public class Array01 {
    public static void main(String[] args) {
        int[] arr01 = {1, 2, 3, 4, 5};
        int i = 1;
        System.out.println(i); //결과값 : 1
        System.out.println(arr01); //결과값 : [I@36baf30c

        // 현재 상황에서 열 내부의 값을 확인할 수가 없습니다. 주소지만 출력이 됩니다.
        // 배열 내부의 다수에 데이터들을 element이라고 한다.
        // 배열 내부에는 다수의 데이터가 있기 때문에 콘솔창에서 전체확인이 불가능하며 메모리 주소가 나온다.
        // 이때 필요한 개념이 index(주소지라고도 합니다) 개념이다.
        System.out.println(arr01);
        System.out.println(arr01[0]);
        System.out.println(arr01[1]);
        System.out.println(arr01[2]);
        System.out.println(arr01[3]);
        System.out.println(arr01[4]);

        // index만 빼고 나머지가 반복는걸 확인하고 반복문을 사용할 수 도 있다.
        for (int j = 0; j < 5; j++) {
            System.out.print(arr01[j] + " ");
        }

        System.out.println();
        for (int j = 0; j < arr01.length; j++) {
            System.out.print(arr01[j] + " / ");
        }

        System.out.println();
        for (int arr : arr01) {
            System.out.print(arr + " ");
        }
        System.out.println();
        // arr01의 length를 확인할때 메서드가 아닌 필드인걸 확인 할 수 있다.

        int[] arr02 = new int[10]; // 10개짜리의 배열을 생성
        // 배열이 그래서 객체인가? -> 완전히 객체는 X / 하지만 filed로 length를 가진다.

        // 배열 내부의 원소의 갯수/ 주소지의 길이 를 우리가 항상 기억하는게 아니기 때문에
        // 배열.length를 쓴다.

        arr01[0] = 10; // << 재대입이다.
        System.out.println(arr01[0]);

        // 그럼 우리는 배열에 값을 대입할 수가 있다.
        // arr02는 현재 10개의 배열이며, 내부에 대입된 값은 없다.

        for (int j = 0; j < arr02.length; j++) {
            arr02[j] = j + 21;
            System.out.print(arr02[j]);
            if (j == arr02.length-1) break;
            System.out.print(" / ");
        }
        System.out.println();
        //arr02에 44, 46, 48...,60이 되도록
        for (int j = 0; j < arr02.length; j++) {
            arr02[j] *= 2;
            System.out.print(arr02[j] + ", ");
        }
        System.out.println();
        //다른 자료형도 동일하게 생성
        String[] strArray01 = {"안", "녕", "하", "세", "요"};
        System.out.println(strArray01[0]);

    }
}
