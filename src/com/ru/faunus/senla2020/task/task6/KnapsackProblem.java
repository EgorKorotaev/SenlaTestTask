package com.ru.faunus.senla2020.task.task6;

import java.util.ArrayList;
import java.util.List;

public class KnapsackProblem {
    private final List<Item> items;
    private List<Item> ans;
    private List<List<Integer>> matrixA;
    private final int maxWeight;

    public KnapsackProblem(int maxWeight, List<Item> items) {
        this.items = items;
        this.maxWeight = maxWeight;
    }

    private void generateMatrixA() {
        for (int i = 0; i < items.size(); i++) {
            matrixA.add(new ArrayList<>());
            matrixA.get(i).add(0, 0);
        }
        for (int i = 0; i < maxWeight; i++) {
            matrixA.get(0).add(i, 0);
        }
        for (int k = 1; k < items.size(); k++) {
            for (int s = 1; s <= maxWeight; s++) {
                if (s >= items.get(k).getWeight()) {
                    matrixA.get(k).add(s, Math.max(matrixA.get(k - 1).get(s), matrixA.get(k - 1).get(s - items.get(k).getWeight()) + items.get(k).getPrice()));
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
        findAns(items.size() - 1, maxWeight);
    }

    private void findAns(int k, int s) {
        if (matrixA.get(k).get(s) != 0) {
            if (matrixA.get(k - 1).get(s).equals(matrixA.get(k).get(s))) {
                findAns(k - 1, s);
            } else {
                ans.add(items.get(k));
                findAns(k - 1, s - items.get(k).getWeight());
            }
        }
    }

    public List<Item> ans() {
        return ans;
    }
}
