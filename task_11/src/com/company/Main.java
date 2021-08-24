package com.company;
import java.util.Scanner;
import java.math.*;
public class Main {

    public static void main(String[] args) {
        float x, fx;
        x = 3;
        if (x<=3)
        {
            fx = (x*x)-3*x+9;
        }
        else fx = 1/((x*x*x)+6);
        System.out.println("The answer of F(x)= " + fx);
    }
}
