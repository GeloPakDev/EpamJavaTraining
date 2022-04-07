package com.company.task2;

public class Ball {
    private int weight;
    private Colors color;

    public Ball(int weight, Colors color) {
        this.weight = weight;
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Colors getColor() {
        return color;
    }

    public void setColor(Colors color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "\nBall{" +
                "weight=" + weight +
                ", color=" + color +
                '}';
    }
}
