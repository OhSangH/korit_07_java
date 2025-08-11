package com.ch17_bean;

import lombok.Getter;
/*
    정보를 담는 객체를 Entity class라고 합니다.
    -> 데이터베이스와 연결되는 클래스만 지칭하기 때문에
    특별한 지위에 있다고 할 수 있음.
        1열       2열         3열        4열        -> 세로줄(열/Column)
    +----------------------------------------+
    | username | password | email     | name |
    ------------------------------------------
    |    1      | 1234    | a@test.com| 안근수|    -> 가로줄(행/Row)
    +----------------------------------------+
 */
//@Entity -> 스프링 부터 설치 시 사용 될 예정
@Getter
public class UserEntity {
    private int userName;
    private int password;
    private String email;
    private String name;

    // 기본 생성자로 user1 객체를 생성하고,
    // 알아서 메서드 정의
    // username / 1
    // password / 9876
    // email / a@test.com
    // name / 이름
    // toString()을 이용해 콘솔에 다음과 같이 출력

    /*
        username : 1
        email : a@test.com
        name : 이름
        비밀번호는 보안상 제공하지 않습니다.
     */

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setUserName(int userName) {
        this.userName = userName;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "userName : " + userName
                + "\nemail : '" + email
                + "\nname : " + name
                + "\n비밀번호는 보안상 제공하지 않습니다.";
    }
}
