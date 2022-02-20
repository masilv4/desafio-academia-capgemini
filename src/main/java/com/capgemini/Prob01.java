package com.capgemini;

public class Prob01 {

    public static void printTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }

            if (i != n) {
                System.out.println();
            }
        }
    }
}
