package com.ch15_casting.centralcontrol;

public class Led implements Power{
    public boolean powerStatus = false;

    @Override
    public void on() {
        System.out.println("LED의 전원을 켭니다.");
        this.powerStatus = true;
    }

    @Override
    public void off() {
        System.out.println("LED의 전원을 끕니다.");
        this.powerStatus = false;
    }

    public void changeColor(){
        System.out.println("조명의 색깔을 바꿉니다.");
    }
}
