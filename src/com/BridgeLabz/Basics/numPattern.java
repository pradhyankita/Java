package com.BridgeLabz.Basics;

public class numPattern {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i+"");
            }
            System.out.println();
        }
        int w=5;
        for(int x=2;x<=w;x++){
            for(int y=x;y<=w;y++){
                System.out.print(x+"");
            }
            System.out.println();
        }
    }
}
