package com.ru.faunus.senla2020.test.task6;

import java.util.ArrayList;
import java.util.List;

public class KnapsackProblem {
    private List<Object> objects;
    private List<Object> ans;
    private List<List<Integer>> matrixA;
    private int weightKnapsack;

    public KnapsackProblem(int weightKnapsack) {
        objects = new ArrayList<>();
        addObject(0, 0);
        matrixA = new ArrayList<>();
        this.weightKnapsack = weightKnapsack;
    }

    public void addObject(int weight, int price){
        objects.add(new Object(weight, price));
    }

    public void addObject(Object object){
        objects.add(object);
    }

    public void generateMatrixA(){
        for (int i = 0; i <= weightKnapsack; i++){
            matrixA.get(0).add(i, 0);
        }
        for (int i = 0; i <= objects.size(); i++){
            matrixA.get(i).add(0, 0);
        }
        for (int k = 1; k <= objects.size(); k++){
            for (int s = 1; s <= weightKnapsack; s++){
                if (s >= objects.get(k).getW()){
                    matrixA.get(k).add(s, Math.max(matrixA.get(k-1).get(s), matrixA.get(k-1).get(s - objects.get(k).getW()) + objects.get(k).getP()));
                } else {
                    matrixA.get(k).add(s, matrixA.get(k-1).get(s));
                }
            }
        }
    }

    public void findAns(){
        generateMatrixA();
        findAns(objects.size(), weightKnapsack);
    }

    public void findAns(int k, int s){
        if (matrixA.get(k).get(s) == 0) {
            System.out.println("отработал");
        }
        if (matrixA.get(k - 1).get(s).equals(matrixA.get(k).get(s))) {
            findAns(k - 1, s);
        } else {
            findAns(k - 1, s - objects.get(k).getW());
        }
    }

    public void setWeightKnapsack(int weightKnapsack){
        this.weightKnapsack = weightKnapsack;
    }

    public int getWeightKnapsack(){
        return weightKnapsack;
    }
}