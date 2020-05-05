package com.ru.faunus.senla2020.test.task6;

public class Item {

    private int weight;
    private int price;

    @Override
    public String toString() {
        return "weight = " + weight +
                ", price = " + price;
    }

    public Item(int weight, int price){
        this.weight = weight;
        this.price = price;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
