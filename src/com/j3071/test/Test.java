package com.j3071.test;

import com.j3071.bean.Dog;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();
//        dog.head=-11111;
        dog.setHead(100);
        System.out.println(dog.getHead());
        dog.show();

    }
}
