package com.BridgeLabz.Basics;

public class star {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        int w = 5;
        for (int x = 2; x <= w; x++) {
            for (int y = x; y <= w; y++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        int q = 1;
        for (int r = 3; r >= q; r++) {
            for (int k = r; k >= q; k++) {
                System.out.print(" ");
            }
            for (int k = 1; k < r; k++) {
                System.out.print("*");
            }
            for (int k = 1; k <= r; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        int num = 4;
        for (int r = num; r >= 1; r--) {
            for (int k = r; k < num; k++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * r - 1); k++) {
                System.out.print("*");
            }
            //for(int k=1;k<=r;k++){
            //  System.out.print("*");
        }
        System.out.println();

    }
}
