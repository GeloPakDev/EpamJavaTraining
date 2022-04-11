package com.company.task2.entity;

public enum Color {
    RED, PINK, ORANGE, YELLOW, PURPLE, GREEN, BLUE, BROWN;

    public static boolean checkColorCorrectness(String color) {
        int i = 0;
        for (Color c : Color.values()) {
            if (c.name().equalsIgnoreCase(color)) {
                i++;
            }
        }
        return i != 0;
    }
}
