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
        System.out.println("장치가 연결되었습니다.");

    }

    private int checkEmpty() { //  Main에서 굳이 사용할 필요값 없어서 private
        for (int i = 0; i < deviceArray.length; i++) {
            if (deviceArray[i] == null) {
                return i;
            }
        }
        return -1;
    }
}
