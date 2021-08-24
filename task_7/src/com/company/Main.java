package com.company;
public class Main {

    public static void main(String[] args) {
        float a, b, c;
        a = 2;
        b = 3;
        c = 4;
        boolean x1, x2;
        if (a+b>c&&a+c>b&&b+c>a)
        {
            x1 = true;
            if ( ( a*a+b*b==c*c) || ( a*a+c*c==b*b) || (b*b+c*c==a*a) )
            {
                x2 = true;
            }
            else x2 = false;
        }
        else
        {
            x1 = false;
            x2 = false;
        }
        System.out.println("The triangle exists: " + x1 + ", the triangle is rectangular: " + x2);
    }
}
