package com.company;
import java.util.Scanner;
import java.math.*;
public class Main {

    public static void main(String[] args) {
        BigInteger ans = BigInteger.valueOf(1);
        for(int i = 1; i <= 200; i++){
            ans = ans.multiply(BigInteger.valueOf((long) i * i));
        }
        System.out.println("Multiplication of the squares of the first two hundred numbers: "+ans);
    }
}
