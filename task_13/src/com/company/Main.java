package com.company;
import java.util.Scanner;
import java.math.*;
public class Main {

    public static void main(String[] args) {
        int a, b, h;
        Scanner in = new Scanner(System.in);
        System.out.printf("Input a: ");
        a = in.nextInt();
        System.out.printf("Input b: ");
        b = in.nextInt();
        System.out.printf("Input h: ");
        h = in.nextInt();
        int y, x;
        for(x = a; x <= b; x += h){
            if(x <= 2){
                y = -x;
            }
            else y = x;
            System.out.println("y = "+y+", when x = "+x);
        }
        in.close();
    }
}
