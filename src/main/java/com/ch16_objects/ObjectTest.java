package com.ch16_objects;

public class ObjectTest {
    private String name;
    private String address;

    public ObjectTest() {
    }

    public ObjectTest(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void showInfo() {
        System.out.println("이름: " + this.name);
        System.out.println("주소: " + this.address);
    }

    @Override
    public String toString() {
        return "ObjectTest{" +
                "address='" + address + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
