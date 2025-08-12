package com.ch18_static.singleton;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Factory {
    // 필드
    private String factoryName;


    public SmartPhone produceSmartPhone() {
        System.out.println(factoryName + "에서 스마트폰을 생성합니다.");

        String model = "갤럭시S26";
        String serial = null;

        Samsung samsung = Samsung.getInstance();
        serial = samsung.createSerialNumber(model);
        return new SmartPhone(samsung.getCompany(), model, serial);
    }
}
