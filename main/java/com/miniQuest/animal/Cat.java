package com.miniQuest.animal;



public class Cat extends Animal {

    public Cat(int age) {
        super(age);
    }

    public void aging(){
        System.out.println(super.age + "살 이야");
    }
    public void meow(){
        System.out.println("야옹야옹");
    }
}
