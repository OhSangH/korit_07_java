package com.ch09_classes;

public class CarMain {
    public static void main(String[] args) {
        Car myCar = new Car();
        Car yourCar = new Car();

        myCar.color = "빨간";
        myCar.speed = 160;

        yourCar.color = "노란";
        yourCar.speed = 180;

        myCar.drive();
        yourCar.brake();
        myCar.displayInfo();
        yourCar.displayInfo();

    }
}
