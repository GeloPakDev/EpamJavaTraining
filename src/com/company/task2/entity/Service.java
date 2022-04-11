package com.company.task2.entity;

public interface Service {
    int calculateBasketWeight(Basket basket);

    int calculateQuantityOfColoredBalls(Color color, Basket basket);
}