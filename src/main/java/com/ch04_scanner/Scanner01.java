package com.ch04_scanner;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        // 변수 선언
//        String name;
//        name = "오상현"; //지금까지의 초기화 방식
        Scanner scanner = new Scanner(System.in);
//        System.out.print("이름을 입력해 주십하세요. >>>> ");
//        name = scanner.next();
        /*
            1. print 와 println의 차이
               ln : line new -> println으로 실행하면 출력문이 다 나오면 자동으로 개행됨.
               print로 작성할 경우에 동일 라인에 그대로 연결됨.
            2. nextLint/ nextInt/ nextDouble 등 으로 타입 구분을 한다.
        */
//        System.out.print("연도를 입력하세요. >>>> ");
//        int year =  scanner.nextInt();
//        System.out.print("이름을 다시 입력하세요. >>>> ");
//        name = scanner.next(); // 입력 시 Oh Sanghyeon
//        System.out.println(name);
        /*
            3. next(Int/Double ... etc) vs nextLine
                - nextLine은 띄어쓰기가 허용
                - 나머지는 허용 안합니다. 띄어쓰기 하면 띄어쓰기 한 부분 부터 잘려서 대입
                  -> 그래서 위 내용에서 name 출력값이 Oh
        */

//        System.out.print("올해는 몇 년도 인가요? >>> ");
//        int year =  scanner.nextInt();
//        System.out.println("당신의 이름은? >>> ");
//        String name = scanner.nextLine();
//        System.out.println("연도 : " + year);
//        System.out.println("이름 : " + name);

        /*
        이상의 코드의 문제는 34번 라인이 실행됐을 때 데이터를 입력 받지 않고
        그대로 넘어가는 문제 발생
        왜 이런경우가 생기는냐 nextInt()에서 값을 입력하고 저희가 enter를 치게 되는데.
        그 경우 다음 nextLine()에서는 enter키를 받아들여서 빈값인 상태로 enter를 쳤다고 인지하게 되기 때문이다.

        */

//        System.out.print("올해는 몇 년도 인가요? >>> ");
//        int year = scanner.nextInt();
//        scanner.nextLine(); // 엔터키를 받아야하는 라인
//        System.out.print("당신의 이름은? >>> ");
//        String name = scanner.nextLine();
//        System.out.println("연도 : " + year);
//        System.out.println("이름 : " + name);

        /*
        1. 다음과 같이 콘솔에 출력 될 수 있도록 코드를 작성하시오.
        나이를 입력하세요 >>>>
        저는 올해 19살입니다.
        내년에는 20살이 됩니다.

        2. 다음과 같이 콘솔에 출력 될 수 있도록 코드를 작성하시오.
        점수를 입력하세요 >>> 4.5
        이름을 입력하세요 >>> 김일
        김일 학생의 점수는 4.5입니다.

        */

        System.out.print("나이를 입력하세요. >>> ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("제 나이는 " + age + "살입니다.\n내년에는 " + (age + 1) + "이 됩니다.");

        // 문제 2의 풀이 1
//        System.out.print("점수를 입력하세요. >>> ");
//        double score = scanner.nextDouble();
//        scanner.nextLine();
//        System.out.print("이름을 입력하세요. >>> ");
//        String name = scanner.nextLine();
//        System.out.println(name + " 학생의 점수는 " + score + "입니다.");
        // 문제 2의 풀이 2 : nextLine()을 사용하지 않고 푸는 방법
        System.out.print("점수를 입력하세요. >>> ");
        double score = scanner.nextDouble();
        System.out.print("이름을 입력하세요. >>> ");
        String name = scanner.next(); // 이름에 띄어쓰기가 없어 next()사용 가능
        System.out.println(name + " 학생의 점수는 " + score + "입니다.");


    }
}
