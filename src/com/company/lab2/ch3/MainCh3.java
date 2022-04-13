package com.company.lab2.ch3;

public class MainCh3 {
    public static void main(String[] args) {
        Fish d = new Fish();
        Cat c = new Cat("Fluffy");
        Animal a = new Fish();
        Animal e = new Spider();
        Pet p = new Cat();

        d.eat();
        System.out.println(d.getName());
        d.play();
        c.walk();
        c.play();
        a.eat();
        a.walk();
        e.eat();
        e.walk();
        p.setName("Randomness");
        System.out.println(p.getName());
        p.play();
    }
}
