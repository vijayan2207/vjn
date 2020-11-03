package com.company;

public class HelloWorld {
    public static void main(String args[])
    {
        System.out.println("\nFind the numbers that are multiples of 3 between 1 and 200: ");

        for (int i=1; i<200; i++) {
            if (i%5==0)
                System.out.print(i +", ");
        }
    }
}
