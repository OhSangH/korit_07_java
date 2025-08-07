package com.ch14_abstraction.interfaces;

public class VolumeDownButton extends Button {

    public void onPressed() {
        System.out.println("볼륨을 한 칸 내립니다.");
    }

    @Override
    public void onDown() {
        System.out.println("볼륨을 계속 내립니다.");
    }
}
