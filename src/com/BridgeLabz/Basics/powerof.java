package com.BridgeLabz.Basics;

class powerof {
    /* Function to check if x is power of 2*/
    boolean isPowerOfTwo(int n)
    {
        return (int)(Math.ceil((Math.log(n) / Math.log(2))))
                == (int)(Math.floor(((Math.log(n) / Math.log(2)))));
    }

    // Driver Code
    public static void main(String[] args)
    {

       // if (isPowerOfTwo(31))
        //    System.out.println("Yes");
        //else
          //  System.out.println("No");

        //if (isPowerOfTwo(64))
          //  System.out.println("Yes");
        //else
          //  System.out.println("No");
    }
}

