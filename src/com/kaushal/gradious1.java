package com.kaushal;

import java.util.Scanner;

public class gradious1 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(roundToNearest(in.nextDouble()));
    }
//    public static double roundToNearesteasy(double value) {
//        return Math.round(value * 100) / 100.0;
//    }
    // that is the easiest method.
    public static double roundToNearest(double n) {
        Double frac = n - (int)n;
        if (n>0)
        {
            if (frac<0.5)
                return n - frac;
            else if (frac>=0.5)
                return n + (1-frac);
            else
                return n;
        }
        else
        {
            if (frac<-0.5)
                return n - (1+frac);
            else if (frac>=-0.5)
                return n - frac;
            else
                return n;
        }
    }
}
