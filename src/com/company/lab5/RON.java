package com.company.lab5;

public class RON extends Currency {
    public RON(Integer value) {
        super(value);
    }

    @Override
    public String toString() {
        return "RON " + getValue();
    }
}