package com.company.task2.util;

import com.company.task2.entity.Color;

public class Validator {
    public static boolean checkColorCorrectness(String color) {
        boolean i = false;
        for (Color c : Color.values()) {
            if (c.name().equalsIgnoreCase(color)) {
                i = true;
                break;
            }
        }
        return i;
    }
}
