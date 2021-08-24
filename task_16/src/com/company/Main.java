package com.company;

public class Main {

    public static void main(String[] args) {
        double n = 256;//В задании не указано какой диапазон символов выводить

        for (int i = 0; i < n; i++) {
            System.out.print(i + " - ");
            System.out.println((char)i);
        }
    }
}
