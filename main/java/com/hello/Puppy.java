package com.hello;

public class Puppy extends Dog{
    public Puppy(String name){
        super(name); // 메인의 Puppy에서 받은 name을 부모 클래스로 넘김
        // 자식 클래스에선 부모 클래스의 생성자를 모두 선언해야함.

    }

    @Override
    public void bark() {
        System.out.println("먕먕");

    }
}
