package com.ch19_generic.wildcard;

public class Main {
    // 메서드 정의
    // 현재 AnimalData에서는 필드로 들어온 객체가 Animal클래스의 서브클래스인지
    // 아닌지 구분할 수 없기 때문에
    // 이를 판단하는 메서드를 Main에서 정의하도록 하겠습니다.
    public AnimalData<? extends Animal> getAnimal(int flag){
        if(flag==1){
            AnimalData<Human> animalData = new AnimalData<>(new Human());
            return animalData;
        }else if(flag==2){
            AnimalData<Tiger> animalData = new AnimalData<>(new Tiger());
            return animalData;
        }
        return null;
    }


    public static void main(String[] args) {
        AnimalData<Tiger> animalData1 = new AnimalData<>(new Tiger());
        AnimalData<Human> animalData2 = new AnimalData<>(new Human());
        AnimalData<Car> animalData3 = new AnimalData<>(new Car());
        /*
            현재 상황에서는 AnimalData에 Car객체가 들어가있지만 오류가 발생하지 않습니다.
            Generic개념 때문에, T에는 어떤 클래스도 들어갈 수 있기 때문입니다.
         */
        animalData1.showData();
        animalData2.showData();
//        animalData3.showData(); // 에러 발생
        /*
            animalData3.showData()는 오류가 발생한다.
            AnimalData클래스에서 정의된 로직을 확인하면 Animal클래스로 Upcasting이 이루어져
            Car클래스는 상속받은 클래스가 아니기 때문에 형변환이 어렵기 때문이다.

            이 오류는 '제네릭'만 사용했을 때 생기는 문제
         */
        //.getAnimal()  메서드 호출
        Main main = new Main();
        AnimalData<? extends Animal> animalData4 = main.getAnimal(1);
        AnimalData<? extends Animal> animalData5 = main.getAnimal(2);
        AnimalData<? extends Animal> animalData6 = main.getAnimal(3);
        /*
            .getAnimal()을 정의하지 않았다 가정하면 현재 animal4,5,6에 어떤 클래스의 객체가
            들어가있는 모른다.
            하지만 정의 하였기 때문에 animal6에는 null값이 들어가는 것을 알고 있다.
         */
        System.out.println();
        if(animalData4!=null){
            animalData4.showData();
        }

        if(animalData5!=null){
            animalData5.showData();
        }

        if(animalData6!=null){
            animalData6.showData();
        }else {
            System.out.println("아무것도 없습니다.");
        }
    }
}
