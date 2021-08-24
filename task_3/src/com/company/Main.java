package com.company;
import java.util.Scanner;
import java.math.*;
public class Main {

    public static void main(String[] args) {
        float x, y;
        x = 30;
        y = 45;
        double z;
        z = (((Math.sin(x))+(Math.cos(y)))/((Math.cos(x))-(Math.sin(y))))*(Math.tan((x*y)));
        System.out.println("The answer of task is: " +z);
    }
}
