package com.BridgeLabz.Basics;

public class star2 {
    public static void main(String[] args) {
        int a=5;
        for(int i=1;i<=a;i++){
        System.out.println();
             for(int j=1;j<=a;j++)
             {
                 System.out.print(" ");
             }
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        }
        System.out.println();
        int w=5;
        for(int x=2;x<=w;x++){

            for(int y=x;y<=w;y++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
