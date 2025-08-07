package com.ch14_abstraction.interfaces;

public class TvRemoteController {
    private PowerButton powerButton;
    private ChannelDownButton channelDownButton;
    private ChannelUpButton channelUpButton;
    private VolumeDownButton volumeDownButton;
    private VolumeUpButton volumeUpButton;


    public TvRemoteController(ChannelDownButton channelDownButton, ChannelUpButton channelUpButton, PowerButton powerButton) {
        this.channelDownButton = channelDownButton;
        this.channelUpButton = channelUpButton;
        this.powerButton = powerButton;
    }

    public TvRemoteController(VolumeDownButton volumeDownButton, VolumeUpButton volumeUpButton) {
        this.volumeDownButton = volumeDownButton;
        this.volumeUpButton = volumeUpButton;
    }

    //이제 이상에서 선언한 필드(객체)의 메서드를 호출하는 방법
    public void onPressedPowerButton() {
        powerButton.onPressed();
    }

    public void onPressedChannelDownButton() {
        channelDownButton.onPressed();
    }

    public void onDownChannelDownButton() {
        channelDownButton.onDown();
    }

    public void onPressedChannelUpButton() {
        channelUpButton.onPressed();
    }

    public void onUpChannelUpButton() {
        System.out.println(channelUpButton.onUp());
    }

    public void onPressedVolumeDownButton() {
        volumeDownButton.onPressed();
    }

    public void onDownVolumeDownButton() {
        volumeDownButton.onDown();
    }

    public void onPressedVolumeUpButton() {
        volumeUpButton.onPressed();
    }

    public void onUpVolumeUpButton1() {
        System.out.println(volumeUpButton.onUp());
    }

    public String onUpVolumeUpButton2() {
        return volumeUpButton.onUp();
    }
}
