package com.company;
import java.util.Scanner;
import java.math.*;
public class Main {

    public static void main(String[] args) {
        float a, b, x, y, z;
        a = 4;
        b = 4;
        x = 3;
        y = 3;
        z = 5;
        boolean ans;
        if (a>=x||a>=y||a>=z)
        {
            if (b>=x||b>=y||b>=z)
            {
                ans = true;
            }
            else ans=false;
        }
        else ans = false;
        System.out.println("The brick will pass through the hole: " + ans);
    }
}
