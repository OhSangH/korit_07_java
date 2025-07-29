package com.ch02_vriable;

public class Main {
    public static void main(String[] args) {
        int scoreEnglish = 100; // 변수 선언 및 초기화
        System.out.println(scoreEnglish); // 출력문

        int koreanScore; // 변수의 자료형 선언
        koreanScore = 99; // 변수의 초기화, 재대입 할 경우에는 자료형을 명시하지 않는다.
        System.out.println(koreanScore);

        String introduction = "안녕하세요, 저는 이번 국비 수업을 듣게 된 오상현입니다.";
        System.out.println(introduction + " 앞으로 잘 부탁드립니다.");

        // 자료형
        // 논리 자료형
        boolean checkFlag1 = false;
        checkFlag1 = true;

        // 문자 자료형
        char name1 = '오';
        char name2 = '상';
        char name3 = '현';
        System.out.println(name1 + name2 + name3); // 결과값 : 154857
        System.out.println('오' + '상' + '현'); // 결과값 : 154857

        System.out.println("" + name1 + name2 + name3); // 결과값 : 오상현
        /*
        문자와 문자열은 서로 다른 개념이다.

        작은 다옴표 ('')는 문자를 표시하기 위한 기호
        큰 따옴표 ("")는 문자열을 표시하기 위한 기호
        (단, python,JavaScript에서는 이런 구분이 없다.)

        그리고, sout()의 출력은 가장 문저 나온 데이터의 자료형을 따라간다는 것을 알 수 있다.

        문자 하나는 '문자'
        문자들이 연속해서 나오는 것은 '문자열'
         */

        char name4 = '김';
        String name5 = "철수";

        System.out.println(123 + 1); // 결과값 : 124
        System.out.println("123" + "1"); // 결과값 : 1231
        System.out.println(123 + "1"); // 결과값 : 1231

        // 정수 자료형
        int width1 = 100;
        int width2 = 100;
        System.out.println(width1 + width2); // 숫자 변수는 연산이 가능합니다.

        // 문자열은 연산이 아니라 " 나열" 됩니다.

        //문자열은 '순서'가 중요합니다.
        Integer width5 = 500;
        Integer width6 = 600;
        System.out.println(width5 + width6); // 근데 대문자로 시작하는 Integer도 있다.

        //실수 자료형 double
        double pi = 3.1415926;
        // 간단 문제: 반지금 43인 원의 둘레 및 넓이를 구하시오.
        int r = 43;

        System.out.println("둘레: " + pi * r * 2);
        System.out.println("넓이: " + pi * r * r);

        // 문자열의 경우에는 '+'연산만 가능하다. ('-'연산은 불가능)
        String name = "안근수";
        String major = "영어교육과";
        String currentJob = "코리아 it 아카데미 국비 강사";
        String previousJob = "영어 교사";

        System.out.println(name);
        System.out.println(major);
        System.out.println(currentJob);
        System.out.println(previousJob);

        System.out.println("안녕하세요 제 이름은 " + name + "입니다. 제 전공은 " + major +
                "이고, 그래서 제 예전 직업은 " + previousJob + "였습니다. 현재는 " +
                currentJob + "입니다.");

        // 이상코드에서 알 수 있는 점은 + Literal의 형태로도 가능하나

        String name10 = "오상현";
        String major10 = "IT 융합제어";
        String mbti10 = "ISFJ";
        int age10 = 26;

        /*
        위 변수를 사용하여
        "저는 코리아 it 아카데미 7월 국비과정을 수강하고 있는 ???입니다.?? 살입니다. -> 줄바꿈
        제 전공은 ?? 학과 이며, mbti는 ????입니다. 열심히 할께요 작성"
         */
        System.out.println("저는 코리아 it 아카데미 7월 국비과정을 수강하고 있는 " + name10 + "입니다. " + age10 + "살입니다.\n" +
                "제 전공은" + major10 + "학과이며, MBTI는 " + mbti10 + "입니다. 열심히 하겠습니다.");


    }
}
