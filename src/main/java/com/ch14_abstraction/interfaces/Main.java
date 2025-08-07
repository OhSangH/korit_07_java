package com.ch14_abstraction.interfaces;
/*
    VolumeDownButton / VolumeUpButton 클래스 생성
    TvRemoteController의 필드에 추가
    onPressedVolumeDownButton() / onDownVolumeDownButton()
    onPressedVolumeUpButton() / onDownVolumeUpButton()


 */
public class Main {
    public static void main(String[] args) {
//        ChannelDownButton channelDownButton = new ChannelDownButton();
//        ChannelUpButton channelUpButton = new ChannelUpButton();
//        PowerButton powerButton = new PowerButton();
//
//        TvRemoteController tvRemoteController = new TvRemoteController(channelDownButton, channelUpButton, powerButton);
        // 굳이 별개의 버튼 객체를 만들지 않고 객체를 생성하는 방법

        TvRemoteController tvRemoteController = new TvRemoteController(new ChannelDownButton(),new ChannelUpButton(),new PowerButton());
        tvRemoteController.onPressedPowerButton();
        tvRemoteController.onPressedChannelDownButton();
        tvRemoteController.onDownChannelDownButton();
        tvRemoteController.onPressedChannelUpButton();
        tvRemoteController.onUpChannelUpButton();

        TvRemoteController tvRemoteController2 = new TvRemoteController(new VolumeDownButton(), new VolumeUpButton());
        tvRemoteController2.onPressedVolumeDownButton();
        tvRemoteController2.onDownVolumeDownButton();
        tvRemoteController2.onPressedVolumeUpButton();
        tvRemoteController2.onUpVolumeUpButton1();
        System.out.println(tvRemoteController2.onUpVolumeUpButton2());

    }
}
