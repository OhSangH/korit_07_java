package com.ch22_exception;

class LoginFailedException extends Exception {
    public LoginFailedException(String message) {
        super(message);
        System.out.println("예외가 발생했습니다.");
    }
}

public class Exception02 {
    public static void login(String id, String pwd) throws LoginFailedException {
        String correctId = "admin";
        String correctPwd = "1q2w3e4r";

        if(!id.equals(correctId) || !pwd.equals(correctPwd)){
//            System.out.println("ID 혹은 비밀번호를 확인하세요.");
            throw new LoginFailedException("ID 또는 PW가 틀렸습니다.");
        }
    }



    public static void main(String[] args) {
        String inputId = "admin";
        String inputPassword = "1234qwer";

//        login(inputId, inputPassword);
        // throws 키워드를 달게 되니 오류가 발생하게 되었다.
        try {
            login(inputId, inputPassword);
        } catch (LoginFailedException e) { // 자동완성으로 사용자 정의 Exception 클래스가 나왔다.
            // 그 근거는 login() 메서드에서 throws LoginFailedException을 작성했기 때문이다.
            System.out.println("로그인 실패 : " + e.getMessage());
        } finally {
            System.out.println("프로그램을 종료합니다.");
        }
    }
}
/*
    사실상 사용자 정의 예외 처리 방식역시
    try / catch / finally 와 throws / throw가 추가 되었을 뿐이지
    method의 정의 / 생성자의 정의/ 객체 생성 방식이라는 코드작성 방식과 변경된거는 없다.
 */