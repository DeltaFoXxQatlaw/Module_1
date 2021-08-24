package com.company;
import java.util.Scanner;
import java.math.*;
public class Main {

    public static void main(String[] args) {
        float x1, y1, x2, y2, x3, y3;
        x1 = 1;
        y1 = 4;
        x2 = 3;
        y2 = 3;
        x3 = 5;
        y3 = 2;
        boolean ans;
        if ((x3 - x1) / (x2 - x1) == (y3 - y1) / (y2 - y1))
        {
            ans = true;
        }
        else ans = false;
        System.out.println("The points are located on the same straight line: " + ans);
    }
}
