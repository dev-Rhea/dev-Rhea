package com.miniQuest.animal;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    public void call(){
        System.out.println(super.name + "(이)라고 불러줘");
    }
    public void introduce(){
        System.out.println("안녕 내 이름은" + super.name + "이야");
    }
}
