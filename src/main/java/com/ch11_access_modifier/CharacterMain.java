package com.ch11_access_modifier;

/*
    다양한 접근지정자를 가지고 있는 필드와 메서드를 정의 및 이를 CharacterMain에서
    테스트

    클래스 설계
    name - 캐릭터 이름 -> 공개 가능
    health - 체력 -> 읽기만 허용
    power - 공격력 -> 같은 패키지만
    skill - 스킬이름 -> 자식 클래스만
    exp - 경험치 -> 외부에서 완전 차단

    객체
    Warrior
    이름 전사
    체력 100
    공격 200
    스킬 세로베기
    exp 30
    으로 기본 생성자를 통해 생성하고, setter를 통해서 데이터를 집어넣으시오

    메서드
    attack() -> 공격 시 콘솔에
        name 이 power의 힘으로 공격!
        name 이(가) 경험치 amount을(를) 얻었습니다. -> call1()유형
    heal() -> 체력을 10 회복하고 현재 체력 출력
        체력이 10 회복되었습니다. 현재 체력: health
    gainExp(int amount) -> call2 유형이고 경험치를 증가시키는 메서드
        name이(가) 경험치 amount을(를) 얻었습니다.


 */
class Character {
    public String name;
    private int health;
    int power;
    protected String skill;
    private int exp;


    //Constructor
    public Character() {
    }

    // 객체 생성시 필수로 요구로 하는 매개변수
    public Character(String name, int power, String skill) {
        this.name = name;
        this.power = power;
        this.skill = skill;

        this.health = 100;
        this.exp = 0;
    }

    //Getter/Setter
    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public int getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }


    public void attack() {
        System.out.println(name + "이(가) " + power + "로 공격!");
        this.gainExp(10);
    }

    private void gainExp(int amount){
        this.exp += amount;
        System.out.println(name + "이(가) 경험치 " + amount + "을(를) 얻었습니다.");
    }

    public void heal(){
        this.health += 10;
        System.out.println(this.name + "의 체력이 10 회복되었습니다. 현재 체력: " +  this.health);
    }
}

public class CharacterMain {
    public static void main(String[] args) {
        Character warrior = new Character("전사", 200, "세로 베기");
//        warrior.setName("전사");
//        warrior.setHealth(100);
//        warrior.setPower(200);
//        warrior.setSkill("세로 베기");
//        warrior.setExp(30);
        System.out.println(warrior.getHealth());

        warrior.attack();
        warrior.heal();
    }
}
