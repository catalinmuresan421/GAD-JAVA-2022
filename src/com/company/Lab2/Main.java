package com.company.Lab2;

public class Main {
    public static void main(String[] args) {

        Fighter fighter1 = new Fighter(100, 14, "Player1");
        Fighter fighter2 = new Fighter(100, 13, "Player2");
        BoxingMatch boxingMatch = new BoxingMatch(fighter1, fighter2);

        Fighter winner = boxingMatch.fight();
        System.out.println("Remaining health for Player1:" + fighter1.getHealth() +
                "\nRemaining health for Player1:" + fighter2.getHealth());
        System.out.println("Winner=" + winner.getName());

    }
}
