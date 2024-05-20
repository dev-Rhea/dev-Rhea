package com.miniQuest.animal;



public class Human extends Animal implements Attribute{
    public Human(double height){
        super(height);
    }

    public void length(){
        System.out.println("내 키는" + super.height + "cm 야");
    }
    public void country(){
        System.out.println("나는 한국인이야");
    }

    @Override
    public void eat() {
        System.out.println("사람은 잡식성이다.");
    }

    @Override
    public void thinking() {
        System.out.println("사람은 사고를 하는 생물이다.");

    }
}
