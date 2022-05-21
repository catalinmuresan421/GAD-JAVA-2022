package com.company.lab5;

public class USD extends Currency {
    public USD(Integer value) {
        super(value);
    }

    @Override
    public String toString() {
        return "USD " + getValue();
    }
}