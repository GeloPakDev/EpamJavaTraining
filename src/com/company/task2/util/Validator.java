package com.company.task2.util;

import com.company.task2.entity.Color;

import java.util.regex.Pattern;

public class Validator {
    public static final String REGEX_POSITIVE_INT = "[0-9]+";

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

    public static boolean checkNumberCorrectness(String number) {
        return Pattern.matches(REGEX_POSITIVE_INT, number);
    }
}
