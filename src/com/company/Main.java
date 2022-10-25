package com.company;


import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Fraction fraction1 = new Fraction(3, 4);
        Fraction fraction2 = new Fraction(5, 2);
        System.out.println(fraction1.multyOnfraction(fraction2));
        System.out.println(fraction1.divideOnfraction(fraction2));
        System.out.println(fraction1.addfraction(fraction2));
        System.out.println(fraction1.subtractfraction(fraction2));
        fraction1.multyOnKoef(4);
        System.out.println(fraction1);
    }
}