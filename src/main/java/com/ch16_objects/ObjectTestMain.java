package com.ch16_objects;

public class ObjectTestMain {
    public static void main(String[] args) {
        ObjectTest objectTest1 = new ObjectTest("안근수", "부산광역시 연제구");
        objectTest1.showInfo();

        System.out.println(objectTest1);

        String example = "안녕하세요";
        boolean result1 = "안녕하세요" == example;
        System.out.println(result1);

        String[] strArrays = {"안녕하세요", "안녕"};
        boolean result2 = "안녕하세요" == strArrays[0];
        boolean result3 = example == strArrays[0];
        System.out.println(result2);
        System.out.println(result3);

        String example2 = new String("안녕하세요");
        boolean result4 = "안녕하세요" ==  example2;
        System.out.println(result4);

        boolean result5 = strArrays[0] == example2;
        System.out.println(result5);

        boolean result6 = example2.equals(strArrays[0]);
        System.out.println(result6);


    }
}
