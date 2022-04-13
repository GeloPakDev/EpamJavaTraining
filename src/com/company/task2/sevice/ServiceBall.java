package com.company.task2.sevice;

import com.company.task2.entity.Basket;
import com.company.task2.entity.Color;

public class ServiceBall implements Service {
    public int calculateBasketWeight(Basket basket) {
        int length = basket.getBasket().size();
        int weight = 0;
        for (int i = 0; i < length; i++) {
            weight += basket.getBasket().get(i).getWeight();
        }
        return weight;
    }

    public int calculateQuantityOfColoredBalls(Color color, Basket basket) {
        int quantity = 0;
        int length = basket.getBasket().size();
        for (int i = 0; i < length; i++) {
            if (basket.getBasket().get(i).getColor() == color) {
                quantity++;
            }
        }
        return quantity;
    }
}