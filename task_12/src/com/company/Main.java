package com.company;
import java.util.Scanner;
import java.math.*;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = in.nextInt();
        int ans = 0;
        for (int i = 1; i<num; i++)
        {
            ans += i;
        }

        System.out.printf("The sum of the numbers from 1 to %d is: %d ", num, ans);
        in.close();
    }
}
