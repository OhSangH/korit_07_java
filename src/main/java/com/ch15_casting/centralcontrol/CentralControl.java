package com.ch15_casting.centralcontrol;

public class CentralControl {
    private Power[] deviceArray;

    public CentralControl(Power[] deviceArray) {
        this.deviceArray = deviceArray;
    }

    public void addDevice(Power device) {
        // 지금 우리는 Power의 자식 클래스에 해당하는 인스턴스들을
        // deviceArray라는 필드에 추가하고 싶습니다.
        // 그러면 CentralControlMain에서 객체 생성을 할 때
        // deviceArray의 최종 indexNumber는 고정되게 되는데,
        // 다 들어차 있는 배열에덮어쓰기가 일어나서도 안되고 (즉 기존 element를 삭제하면 안됨)
        // 비어있는 element에 device추가를 할 수 있어야 한다.
        // 그렇다면 필요한 기능이 배열내에 null값이 존재하는지에 대한 체크가 필요하다고
        // 할 수 있습니다.

        int emptyIndex = checkEmpty();
        if (emptyIndex != -1) {
            this.deviceArray[emptyIndex] = device;
        } else {
            System.out.println("더 이상 장치를 연결 할 수 없습니다.");
            return;
        }
        System.out.println(device.getClass().getSimpleName() + "장치가 연결되었습니다.");
        /*
            .getClass() -> 클래스 명을 return하는 method + 패키지 경로 포함
            .getClass().getSimpleName() -> 클래스명만 출력됨
            현재 보면 메서드의 값으로 체인닝 메서드를 진행하는데 return값의 유형을 명확히
            알고 있어야 한다.
         */
    }

    private int checkEmpty() { //  Main에서 굳이 사용할 필요값 없어서 private
        for (int i = 0; i < deviceArray.length; i++) {
            if (deviceArray[i] == null) {
                return i;
            }
        }
        return -1;
    }

    public void powerOn() {
        for (Power device : deviceArray) {
            if (device != null) {
                device.on();
                continue;
            }
            System.out.println("연결된 디바이스가 없습니다.");
        }
    }

    public void powerOff() {
        for (Power device : deviceArray) {
            if (device != null) {
                device.off();
                continue;
            }
            System.out.println("연결된 디바이스가 없습니다.");
        }
    }

    /*
        .getClass().getSimpleName() 이용해서 몇번 인덱스에 무슨 클래스가있는지 확인
        슬롯 [1] 번 : Computer
        슬롯 [2] 번 : LED
        ...
        슬롯 [10] 번 : Empty

     */
    public void showInfo() {
        for (int i = 0; i < deviceArray.length; i++) {
            System.out.println("슬롯 [" + (i + 1) + "] 번 : " + (deviceArray[i] != null ? deviceArray[i].getClass().getSimpleName() : "empty"));
        }
    }

   /*
        각 클래스들의 각 개체들은 업캐스팅하여
        Power의 field인 deviceArray에 속해있다
    */

    // 다운캐스팅 연습 *효율적이진 않음
    public void performSpecificMethod() {
        for (Power device : deviceArray) {
            if (device instanceof AirConditioner) {
                AirConditioner airConditioner = (AirConditioner) device; //명시적 다운캐스팅
                airConditioner.changeMode();
            } else if (device instanceof Computer) {
                Computer computer = (Computer) device;
                computer.compute();
            } else if (device instanceof Led) {
                Led led = (Led) device;
                led.changeColor();
            } else if (device instanceof Mouse) {
                Mouse mouse = (Mouse) device;
                mouse.leftClick();
            } else if (device instanceof Speaker) {
                Speaker speaker = (Speaker) device;
                speaker.changeEqual();
            } else if (device instanceof Printer) {
                Printer printer = (Printer) device;
                printer.print();
            } else if (device == null) {
                System.out.println("장치가 연결되어 있지않습니다.");
            } else {
                System.out.println("아직 지원하지 않는 기기입니다.");
            }
        }
    }
}
