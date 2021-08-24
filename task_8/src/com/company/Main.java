package com.company;
import java.util.Scanner;
import java.math.*;
public class Main {

    public static void main(String[] args) {
        float a, b, c, d;
        a = -3;
        b = -2;
        c = 4;
        d = 8;
        float min1, min2, max;

        if (a<b)
        {
            min1 = a;
        }
        else min1 = b;
        if (c<d)
        {
            min2 = c;
        }
        else min2 = d;

        if (min1>min2)
        {
           max = min1;
        }
        else max = min2;
        System.out.println("max[min(a,b),min(c,d)] = " + max);
    }
}
