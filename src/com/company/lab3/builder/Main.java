package com.company.lab3.builder;

public class Main {
    public static void main(String[] args) {
        Helicopter.Builder builder = new Helicopter.Builder("H123");

        builder.setColor("Red");
        builder.setMaxHeight(25);
        builder.setMaxSpeed(150)
                .setType(HelicopterTypes.ATTACK)
                .setWeight(6800);

        Helicopter helicopter = builder.build();
        System.out.println(helicopter);

        builder.setWeight(6500);
        Helicopter helicopter2 = builder.build();
        System.out.println(helicopter2);
    }
}
