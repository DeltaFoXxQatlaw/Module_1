package com.company;
import java.util.Scanner;
import static java.lang.Math.pow;
import static java.lang.Math.abs;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input m: ");
        int m = in.nextInt();
        System.out.print("Input n: ");
        int n = in.nextInt();
        for (int i = m; i <= n; i++) {
            System.out.print(i+": ");

            for (int j = 2; j<i;j++)
            {
                if(i%j==0)
                {
                    System.out.print(j+", ");

                }
            }
            System.out.println(" ");
        }
    }
}
