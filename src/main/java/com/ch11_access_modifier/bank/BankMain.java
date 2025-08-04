package com.ch11_access_modifier.bank;

public class BankMain {
    public static void main(String[] args) {
        Bank bank1 = new Bank("홍길동",123456, 100000);
        Bank bank2 = new Bank("신사임당", 987654, 500000);

        bank1.setPinNumber(123456);
        bank1.setPinNumber(123);

        bank2.setPinNumber(123);

        bank1.showAccountInfo();
        bank2.showAccountInfo();

        System.out.println();
        bank1.deposit(50000,123);
        bank1.withdraw(300000,123);
        bank1.withdraw(100000,123);

        bank2.withdraw(100000,123);
        bank2.deposit(200000,123);
        bank2.withdraw(1000000,123);

        bank1.showAccountInfo();
        bank2.showAccountInfo();

        Bank bank4 = new Bank("김사",1000000, -3000, 12356);
        bank4.showAccountInfo();
    }
}
