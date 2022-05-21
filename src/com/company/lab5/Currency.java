package com.company.lab5;

public abstract class Currency {
    private int value;

    public Currency(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}