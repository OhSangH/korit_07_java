package com.ch11_access_modifier.bank;

import java.util.Scanner;

/*
    과제 가이드 라인
    1. 필드
        accountNum(계좌번호)
        accountHolder(예금주)
        balance(잔액)
        pinNumber(비밀번호, 4 자리 정주 0~9999)

    2. 생성자
        기본
        계좌번호
        계좌번호,예금주
        계좌번호, 예금주, 초기잔액
        계좌번호, 예금주, 초기잔액, 비밀번호

    3. 메서드
        게터/세터
            유효성 로직작성
                -> 잔액 양수
                -> 비밀번호 0~9999까지 -> 실패시 "불가능한 비밀번호입니다."
        deposit(int amount, int inputPin) -> 입근관련 메서드 call2() 유형
            - 비밀번호 체크 -> 실패시 "비밀번호가 틀렸습니다." 메서드 종료
            - 유효 금액인지 검증 ( amount 0초과) -> 실패 시 "불가능한 입력 금액입니다."
            - 콘솔창에
                 ㅇㅇㅇㅇㅇ원 입금 성공하였습니다. 현재 잔액 : ㅇㅇㅇㅇㅇ원
        withdraw(int amount, int inputPin) -> 출금 관련 메서드/ call2()유형
            - 비밀번호 체크 -> 실패시 "비밀번호가 틀렸습니다." 메서드 종료
            - 유효 금액인지 검증 ( amount 0초과) -> 실패 시 "불가능한 입력 금액입니다."
            - 출금후 잔액이 0이상인지 확인 -> 음수라면 "출금 불가입니다."
            -콘솔창에
                ㅇㅇㅇㅇㅇ원 출금 성공하였습니다. 현재 잔액 : ㅇㅇㅇㅇㅇ원
        showAccountInfo()
            -콘솔창에
                계좌번호:
                계좌 소유자:
                현재 잔액:
            라고 출력

        예

        계좌번호 : 123456
        계좌 소유자 : 홍길동
        현재 잔액 : 100000원

        계좌번호 : 987654
        계좌 소유자 : 신사임당
        현재잔액 : 500000원

        50000원이 입금되었습니다. 현재 잔액 : 150000원
        잔액이 부족하여 출금할 수 없습니다.
        100000원이 출금 되었습니다. 현재 잔액: 50000원

        100000원이 출금 되었습니다. 현재 잔액 : 400000원
        200000원이 입금 되었습니다. 현재 잔액 : 600000원
        잔액이 부족하여 출금할 수 없습니다.

        계좌 정보
        계좌
 */
public class Bank {
    private int accountNum;
    private String accountHolder;
    private int pinNumber;
    private int balance;
    private static final Scanner sc = new Scanner(System.in);


    public Bank() {
    }

    public Bank(int accountNum) {
        this.accountNum = accountNum;
    }

    public Bank(String accountHolder, int accountNum) {
        this.accountNum = accountNum;
        this.accountHolder = accountHolder;
    }

    public Bank(String accountHolder, int accountNum, int balance) {
        this.accountHolder = accountHolder;
        this.accountNum = accountNum;
        setBalance(balance);
    }

    public Bank(String accountHolder, int accountNum, int balance, int pinNumber) {
        this.accountHolder = accountHolder;
        this.accountNum = accountNum;
        setBalance(balance);
        setPinNumber(pinNumber);
    }



    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public int getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(int accountNum) {
        this.accountNum = accountNum;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        if (balance < 0) {
            System.out.println("불가능한 금액입니다.");
            return;
        }
        this.balance = balance;
    }

    public void setPinNumber(int pinNumber) {
        if (pinNumber < 0 || pinNumber > 9999) {
            System.out.println("불가능한 비밀번호입니다.");
            return;
        }
        this.pinNumber = pinNumber;
    }



    public void deposit(int amount, int inputPin) {
        if (inputPin != pinNumber) {
            System.out.println("비밀번호가 틀렸습니다.");
            return;
        }
        if (amount < 0) {
            System.out.println("불가능한 입력 금액입니다.");
            return;
        }
        balance += amount;
        System.out.println(amount + "원 입금 성공하였습니다. 현재 잔액 : " + balance + "원");
    }

    public void withdraw(int amount, int inputPin) {
        if (inputPin != pinNumber) {
            System.out.println("비밀번호가 틀렸습니다.");
            return;
        }
        if (amount < 0) {
            System.out.println("불가능한 입력 금액입니다.");
            return;
        }
        if (amount > balance) {
            System.out.println("잔액이 부족하여 출금할 수 없습니다.");
            return;
        }

        balance -= amount;
        System.out.println(amount + "원 출금 성공하였습니다. 현재 잔액 : " + balance + "원");
    }

    public static int inputPinNum() {
        System.out.print("핀번호를 입력해 주세요 >>> ");
        return sc.nextInt();
    }

    public void showAccountInfo() {
        System.out.println("\n계좌 번호 : " + accountNum);
        System.out.println("계좌 소유주 : " + accountHolder);
        System.out.println("계좌 잔액 : " + balance + "원");
    }
}
