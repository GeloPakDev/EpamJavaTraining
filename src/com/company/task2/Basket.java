package com.company.task2;

import java.util.List;

public class Basket {
    private List<Ball> basket;

    public Basket(List<Ball> basket) {
        this.basket = basket;
    }

    public List<Ball> getBasket() {
        return basket;
    }

    public void setBasket(List<Ball> basket) {
        this.basket = basket;
    }

    @Override
    public String toString() {
        return "Basket{\n" +
                "basket=" + basket +
                '}';
    }
}
