package com.ru.faunus.senla2020.test.task6;

import java.util.ArrayList;
import java.util.List;

public class KnapsackProblem {
    private List<Item> items;
    private List<Item> ans;
    private List<List<Integer>> matrixA;
    private int weightKnapsack;

    public KnapsackProblem(int weightKnapsack) {
        items = new ArrayList<>();
        addObject(0, 0);
        this.weightKnapsack = weightKnapsack;
    }

    public void addObject(int weight, int price) {
        items.add(new Item(weight, price));
    }

    public void addObject(Item item) {
        items.add(item);
    }

    public void generateMatrixA() {
        for (int i = 0; i < items.size(); i++) {
            matrixA.add(new ArrayList<>());
            matrixA.get(i).add(0, 0);
        }
        for (int i = 0; i < weightKnapsack; i++) {
            matrixA.get(0).add(i, 0);
        }
        for (int k = 1; k < items.size(); k++) {
            for (int s = 1; s <= weightKnapsack; s++) {
                if (s >= items.get(k).getW()) {
                    matrixA.get(k).add(s, Math.max(matrixA.get(k - 1).get(s), matrixA.get(k - 1).get(s - items.get(k).getW()) + items.get(k).getP()));
                } else {
                    matrixA.get(k).add(s, matrixA.get(k - 1).get(s));
                }
            }
        }
    }

    public void findAns() {
        matrixA = new ArrayList<>(items.size());
        generateMatrixA();
        ans = new ArrayList<>();
        findAns(items.size() - 1, weightKnapsack);
    }

    public void findAns(int k, int s) {
        if (matrixA.get(k).get(s) == 0) {
            System.out.println("отработал");
            break;
        } else if (matrixA.get(k - 1).get(s).equals(matrixA.get(k).get(s))) {
            findAns(k - 1, s);
        } else {
            ans.add(items.get(k));
            findAns(k - 1, s - items.get(k).getW());
        }
    }

    public String ans() {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i <= ans.size(); i++) {
            output.append(ans.get(i));
        }
        return output.toString();
    }

    public void setWeightKnapsack(int weightKnapsack) {
        this.weightKnapsack = weightKnapsack;
    }

    public int getWeightKnapsack() {
        return weightKnapsack;
    }
}