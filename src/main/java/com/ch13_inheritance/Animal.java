package com.ch13_inheritance;

public class Animal {
    private String animalName;
    private int animalAge;

    // 생성자 전부


    public Animal() {
    }

    public Animal(int animalAge, String animalName) {
        this.animalAge = animalAge;
        this.animalName = animalName;
    }

    public Animal(int animalAge) {
        this.animalAge = animalAge;
    }

    public Animal(String animalName) {
        this.animalName = animalName;
    }


    public int getAnimalAge() {
        return animalAge;
    }

    public void setAnimalAge(int animalAge) {
        this.animalAge = animalAge;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }


    public void move() {
        System.out.println("움직입니다.");
    }
}


