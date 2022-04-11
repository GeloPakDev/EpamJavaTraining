package com.company;

import com.company.task2.entity.Ball;
import com.company.task2.entity.Color;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Ball> list = new ArrayList<>();
        //Using try with resources for auto closing the source of data
        try (BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\super\\Desktop\\GELO\\Computer Science\\text.txt"))) {
            String line;
            while ((line = in.readLine()) != null) {
                String[] split = line.split(", ");
                if (Color.checkColorCorrectness(split[0]) && Integer.parseInt(split[1]) > 0) {
                    Color color = Color.valueOf(split[0].toUpperCase());
                    int weight = Integer.parseInt(split[1]);
                    list.add(new Ball(weight, color));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.print(list);
    }
}
