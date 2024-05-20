package com.miniQuest;

import com.miniQuest.animal.Cat;
import com.miniQuest.animal.Dog;
import com.miniQuest.animal.Human;

public class Main {

    public static void main(String[] args){
        Dog dog = new Dog("댕댕");
        dog.call();
        dog.introduce();


        Cat cat = new Cat(3);
        cat.aging();
        cat.meow();
        cat.call(); //null 로 표시됨

        Human human = new Human(189.2);
        human.length();
        human.country();
        human.thinking();
        human.eat();
    }
}
