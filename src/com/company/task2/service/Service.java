package com.company.task2.service;

import com.company.task2.entity.Basket;
import com.company.task2.entity.Color;

public interface Service {
    int calculateBasketWeight(Basket basket);

    int calculateQuantityOfColoredBalls(Color color, Basket basket);
}