package com.company;

import com.company.task2.Ball;
import com.company.task2.Basket;
import com.company.task2.Colors;
import com.company.task2.ServiceBall;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Ball> listOfBalls = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            listOfBalls.add(new Ball(random.nextInt(5) + 15, Colors.getRandomColor()));
        }
        Basket basket = new Basket(listOfBalls);

        System.out.println(ServiceBall.getQuantityOfColoredBalls(Colors.GREEN, basket));
    }
}
