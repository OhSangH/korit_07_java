package com.ch16_objects.teacher;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TeacherMain {
    public static void main(String[] args) {
        com.ch16_objects.Teacher teacher1 = new com.ch16_objects.Teacher("안근수", "코리아아이티");
        com.ch16_objects.Teacher teacher2 = new com.ch16_objects.Teacher("안근수", "코리아아이티");

        boolean result1 = teacher1.equals(teacher2);
        System.out.println(result1);
        // hashCode(), equals() 메서드 재정의 전 : false
        // 재정의 후 :true
        // 재정의 이전에는 teacher1 과 teacher2 의 주소값까지 확인하여 같은지 여부 파악을 했다
        // 하지만 재정의 이후에는 필드에 입력된 데이터값이 동일한지만 체크하기 때문이다

        Class tClass = teacher1.getClass();
        System.out.println(tClass); // class com.ch16_objects.Teacher.Teacher
        System.out.println(tClass.getSimpleName()); //Teacher
        System.out.println(teacher1.getClass().getSimpleName()); //Teacher
        // 성향에 따라 메서드 체이닝이 어떻게 진행될지에 따라 변수에 대입 할 지 아니면
        // 그냥 사용 할 지 정하면 된다.

        Field[] fields = tClass.getDeclaredFields();
//        System.out.println(fields); //주소지 출력
        for (Field field : fields) {
            System.out.println("필드명 출력 : " + field.getName());
            System.out.println("패키지명 + 클래스명 출력 : " + field.getClass());
            System.out.println("클래스명 출력 : " + field.getClass().getSimpleName() + "\n");
        }

        Method[] methods = tClass.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("메서드명 출력 : " + method.getName());
            System.out.println("리턴 타입 출력 : " + method.getReturnType() + "\n");
        }


        com.ch16_objects.Teacher teacher3 = new com.ch16_objects.Teacher("안근수", "코리아아이티");
        boolean result2 = teacher3.equals(teacher1);
        System.out.println(result2);

//        System.out.println(teacher3 instanceof com.ch16_objects.Teacher);
        // teacher3의 자료형은 ch16_objects.Teacher이지
        // ch16_objects.teacher.Teacher가 아닙니다.
    }
}
