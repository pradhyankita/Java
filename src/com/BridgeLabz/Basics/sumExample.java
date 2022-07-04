package com.BridgeLabz.Basics;

public class sumExample {
    static void sum(){
        int x=10;
        int y=20;
        int sum =x+y;
        System.out.println("Sum is " +sum);
    }

    static int Sub(int x, int y){
        int subtraction =x-y;
        return subtraction;
    }

    static int multiply(int x, int y){
        int multiplication =x*y;
        return multiplication;
    }

    static int Div(int x, int y){
        int Division =x/y;
        return Division;
    }
    static int Mod(int x, int y){
        int Modulus =x%y;
        return Modulus;
    }

    public static void main(String[] args){
        sum();
        int result= multiply(4,5);
        int Result= multiply(2,6);
        int Res= Div(6,3);
        int output= Mod(8,2);
        int outcome= Sub(8,2);
        System.out.println("Result1=>"+result);
        System.out.println("Result2=>"+Result);
        System.out.println("Result3=>"+Res);
        System.out.println("Result3=>"+output);
        System.out.println("Result4=>"+outcome);
    }
}
