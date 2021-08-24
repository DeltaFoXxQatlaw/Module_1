package com.company;
import java.util.Scanner;
import static java.lang.Math.pow;
import static java.lang.Math.abs;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input e: ");
        double e = in.nextDouble();
        double sum = 0;
        double n = 1000;

        for (int i = 0; i < n; i++) {
            double a = (1 / (pow(2, i))) + (1 / (pow(3, i)));
            if (abs(a) >= e) {
                sum += a;
                n++;
            }
        }
        System.out.println("The sum is: " +sum);
    }
}
