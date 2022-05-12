package com.company.lab3.factory;

public class Main {
    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        Pizza nyCheesePizza = nyPizzaStore.orderPizza("Cheese");
        Pizza nyPepperoni = nyPizzaStore.orderPizza("Pepperoni");
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        Pizza chicagoPizza = chicagoPizzaStore.orderPizza("Cheese");
    }
}