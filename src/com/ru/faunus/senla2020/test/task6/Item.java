package com.ru.faunus.senla2020.test.task6;

public class Item {

    private int w;
    private int p;

    @Override
    public String toString() {
        return "Object{" +
                "weight = " + w +
                ", price = " + p +
                '}';
    }

    public Item(int weight, int price){
        w = weight;
        p = price;
    }

    public void setW(int w) {
        this.w = w;
    }

    public int getW() {
        return w;
    }

    public int getP() {
        return p;
    }

    public void setP(int p) {
        this.p = p;
    }
}
