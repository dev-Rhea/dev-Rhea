package com.miniQuest.animal;

public class Animal {
    protected String name;
    protected int age;
    protected double height;

    public Animal(String name){
        this.name = name;
    }
    public void call(){
        System.out.println("Calling " + name);
    }
    public Animal(int age){
        this.age = age;
    }
    public void aging(){
        System.out.println("Aging " + age);
    }
    public Animal(double height){
        this.height = height;
    }
    public void length(){
        System.out.println("Length " + height);
    }
}
