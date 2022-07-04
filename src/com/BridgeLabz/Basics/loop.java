package com.BridgeLabz.Basics;

public class loop
{
    public static void main(String args[])
    {
        int i, j;
        for (i=1;i<=4;i++)
        {
            for (j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        int p, q;
        for (p=1;p<=4;p++)
        {
            for (q=4;q>=i;q++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}