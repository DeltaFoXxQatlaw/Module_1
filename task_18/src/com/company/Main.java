package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input first number: ");
        int a = in.nextInt();
        System.out.print("Input second number: ");
        int b = in.nextInt();
        int [] mass = new int[10];
        while(a != 0){
                int x1 = a % 10;
                int b_t=b;
                while(b_t != 0){
                        int x2 = b_t % 10;
                        if (x1==x2)
                        {
                            mass[x1]=1;
                        }
                    b_t /=10;
                }

            a /=10;
        }
        for (int i = 0; i<10; i++)
        {
            if (mass[i]!=0)
            {
                System.out.println(i);
            }
        }
    }
}
