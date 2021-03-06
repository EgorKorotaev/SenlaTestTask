package com.ru.faunus.senla2020.task.task6;

public class Item {

    private final int weight;
    private final int price;

    @Override
    public String toString() {
        return "weight = " + weight +
                ", price = " + price;
    }

    public Item(int weight, int price) {
        this.weight = weight;
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public int getPrice() {
        return price;
    }
}
