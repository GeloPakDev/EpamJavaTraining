package com.company.task2.util;

import com.company.task2.entity.Ball;
import com.company.task2.entity.Color;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class DataReader {
    public List<Ball> readData(String path) {
        List<Ball> list = new ArrayList<>();
        //Using try with resources for auto closing the source of data
        try (BufferedReader in = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = in.readLine()) != null) {
                String[] split = line.split(", ");
                if (Validator.checkColorCorrectness(split[0]) && Integer.parseInt(split[1]) > 0) {
                    Color color = Color.valueOf(split[0].toUpperCase());
                    int weight = Integer.parseInt(split[1]);
                    list.add(new Ball(weight, color));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
