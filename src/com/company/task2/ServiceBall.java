package com.company.task2;

public class ServiceBall {
    public static int getBasketWeight(Basket basket) {
        int length = basket.getBasket().size();
        int weight = 0;
        for (int i = 0; i < length; i++) {
            weight += basket.getBasket().get(i).getWeight();
        }
        return weight;
    }

    public static int getQuantityOfColoredBalls(Colors color, Basket basket) {
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
