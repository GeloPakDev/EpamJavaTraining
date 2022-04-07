package com.company.task2;

import java.util.Random;

public enum Colors {
    RED, PINK, ORANGE, YELLOW, PURPLE, GREEN, BLUE, BROWN;

    public static Colors getRandomColor() {
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }
}
