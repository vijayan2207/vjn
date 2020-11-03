package com.company;

public class HelloWorld {
    public static void main(String[] args)
    {
        System.out.println("\nFind the numbers that are multiples of 3 & 5 between 1 and 100: ");

        for (int i=1; i<100; i++) {
            if (i%3==0)
                System.out.print(i +", ");
        }

        for (int j=1; j<100; j++) {
            if (j%5==0)
                System.out.print(j +", ");
        }
    }
}
