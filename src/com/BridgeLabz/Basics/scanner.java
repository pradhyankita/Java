package com.BridgeLabz.Basics;
import java.util.Scanner;
public class scanner {

        public static void main(String args[])
        {
            int x, y, z;
            System.out.println("Enter two integers to calculate their sum ");
            Scanner in = new Scanner(System.in);
            x = in.nextInt();
            y = in.nextInt();
            z = x + y;
            System.out.println("Sum of entered integers = "+z);
            z = x - y;
            System.out.println("Subtraction of entered integers = "+z);
            z = x * y;
            System.out.println("Mulitplication of entered integers = "+z);
            z = x / y;
            System.out.println("Division of entered integers = "+z);
            z = x % y;
            System.out.println("Modulus of entered integers = "+z);
        }

}

