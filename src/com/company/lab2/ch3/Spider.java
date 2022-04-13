package com.company.lab2.ch3;

public class Spider extends Animal {
    Spider(){
        super(8);
    }

    @Override
    public void walk() {
        System.out.println("Spider walk");
    }

    @Override
    public void eat() {
        System.out.println("Spider eat");
    }
}
