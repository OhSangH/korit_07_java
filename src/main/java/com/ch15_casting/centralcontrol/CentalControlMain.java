package com.ch15_casting.centralcontrol;

/*
    프로그램 구현 사항
    interface Power을 implement한 다양한 클래스를 정의할 예정
    예를 들어 Computer / AirConditioner / Speaker들이 전부 파워를
    implement하게 되면 이상의 세 클래스들은 강제적으로
    on() / off() 메서드들을 override해야만 합니다.

    Computer / AirConditioner / Speaker 객체들을
    전분 Power로 업캐스팅 시키게 된다면
    Computer / AirConditioner / Speaker 객체의 원래 클래스와 상관없이
    Power 클래스의 조작만으로 on() / off() 메서드를 호출 시키는 것이 가능합니다.

    즉 B b = new B(); 로 애초에 객체를 생성하면 되지 앟ㄴ냐는 아까까지의 의문을
    A의 작식 클래스가  B 하나뿐일때만 적용된다고 볼 수 있습니다.
    A의 자식 클래스가 B,C,D,E ... 여러개가 있다고 가정한다면
    그것을 업캐스팅 했을 때 A각 가지고 있는 부모 메서드를 호출함으로써
    다수의 서로 다른 클래스의 객들을 통제할 수 있다는 장점 때문에 업캐스팅을
    적용하게 된다.
    그리고 다운 캐스팅을 해서 각각의 고유 메서드도 사용 가능하게 된다.

    AriConditioner 클래스 생성 Power 구현
    에어컨의 전원을 켭니다.
    에어컨의 전원을 끕니다.로 정의
    Speaker 도 동일
 */
public class CentalControlMain {
    public static void main(String[] args) {
        // 각 클래스의 객체 생성
        Computer computer1 = new Computer();
        AirConditioner airConditioner1 = new AirConditioner();
        Speaker speaker1 = new Speaker();

        // 잠조 자료형의 배열을 생성 (비어있는거)
//        Power[] powers = new Power[5];
        //이하의 코드는 Powers 생성하면서 indexNumber가 고정되기 때문에 예시만 보여줄 에정이다.
//        Power[] powers = {new Computer(), new AirConditioner(), new Speaker()};

        CentralControl centralControl = new CentralControl(new Power[10]);
        centralControl.addDevice(computer1);
        centralControl.addDevice(airConditioner1);
        centralControl.addDevice(speaker1);


        Mouse mouse1 = new Mouse();
        Led led1 = new Led();
        centralControl.addDevice(mouse1);
        centralControl.addDevice(led1);

        Printer printer1 = new Printer();
        centralControl.addDevice(printer1);

        centralControl.powerOn();
        System.out.println(led1.powerStatus);
        centralControl.powerOff();
        System.out.println(led1.powerStatus);

        System.out.println("=".repeat(40));
        centralControl.showInfo();

        System.out.println();
        centralControl.performSpecificMethod();

    }
}
