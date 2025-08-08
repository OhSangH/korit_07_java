package com.ch14_abstraction.interfaces;

/*
    PowerButton,
    TemperatureDownButton,
    TemperatureUpButton,
    ModeChangeButton -> 버튼 한번 누를때 마다 모드 변환
    제습 -> (냉방 <-> 난방) -> 자동
    : Press 버튼 활용 하여 한 번 누르면 그 다음 모드로 이동

    AllArgsConstructor 정의

    실행 예
    에어컨 리모컨 객체가 생성되었습니다.
    전원을 켭니다.
    온도를 한 칸 내립니다.
    온도를 계속 내립니다.
    온도를 한 칸 올립니다.
    온도를 계속 올립니다.
    난방으로 바뀝니다.
    냉방으로 바뀝니다.
    전원을 끕니다.
 */
public class AirConditionerController {
    private PowerButton powerButton;
    private TemperatureDownButton temperatureDownButton;
    private TemperatureUpButton temperatureUpButton;
    private ModeChangeButton modeChangeButton;

    public AirConditionerController(PowerButton powerButton, TemperatureDownButton temperatureDownButton, TemperatureUpButton temperatureUpButton, ModeChangeButton modeChangeButton) {
        System.out.println("에어컨 리모컨 객체가 생성되었습니다.");
        this.modeChangeButton = modeChangeButton;
        this.powerButton = powerButton;
        this.temperatureDownButton = temperatureDownButton;
        this.temperatureUpButton = temperatureUpButton;
    }

    public void onPressedPowerButton() {
        powerButton.onPressed();
    }

    public void onPressedTemperatureDownButton() {
        temperatureDownButton.onPressed();
    }

    public void onPressedTemperatureUpButton() {
        temperatureUpButton.onPressed();
    }

    public void onDownTemperatureDownButton() {
        temperatureDownButton.onDown();
    }

    public void onUpTemperatureUpButton() {
        System.out.println(temperatureUpButton.onUp());
    }

    public void modeChangeButton() {
        modeChangeButton.onPressed();
    }

    public void testModeChangeButton() {
        modeChangeButton.modeChange();
    }
}
