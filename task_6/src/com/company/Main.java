package com.company;
import java.util.Scanner;
import java.math.*;
public class Main {

    public static void main(String[] args) {
        float x, y;
        x = -3;
        y = -2;
        boolean ans;
        System.out.println("Start coordinates is: x = "+x+", y = "+y);
        if ((x<2&&x>-2&&y>0&&y<4)||(x<4&&x>-4&&y<0&&y>-3))
        {
            ans = true;
        }
        else ans = false;
        System.out.println("The answer of task is: " + ans);
    }
}
