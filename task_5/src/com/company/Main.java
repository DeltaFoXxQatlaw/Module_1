package com.company;
import java.util.Scanner;
import java.math.*;
public class Main {

    public static void main(String[] args) {
        double R = 432.956;
        System.out.println("Start number is: "+R);
        double x1 = (int)R;
        double z = x1 / 1000 + (R - x1) * 1000;
        String str = String.format("The answer of task is: %.3f", z);
        System.out.println(str);
    }
}
