package com.company;
import java.util.Scanner;
import java.math.*;
public class Main {

    public static void main(String[] args) {
        float a, b, c;
        a = 1;
        b = 2;
        c = 3;
        double z, z1, z2;
        z1 = b + Math.sqrt((Math.pow(b,2))+(4*a*c));
        z2 = (Math.pow(a,3))*c+(Math.pow(b,-2));
        System.out.println("z1: " +z1);
        System.out.println("z2: " +z2);
        z = (z1/(2*a))-z2;
        System.out.println("The answer of second task is: " +z);
    }
}
