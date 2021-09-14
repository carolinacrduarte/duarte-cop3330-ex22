/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Carolina Duarte
 *
 */

import java.util.Scanner;

public class Exercise22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int first_n = input.nextInt();
        System.out.print("Enter the second number: ");
        int second_n = input.nextInt();
        if (first_n == second_n)
        {
            System.exit(0);
        }

        System.out.print("Enter the third number: ");
        int third_n = input.nextInt();

        if (first_n == third_n)
        {
            System.exit(0);
        }
        if (second_n == third_n)
        {
            System.exit(0);
        }

        if (first_n > second_n && first_n > third_n)
        {
            System.out.print("The largest number is " + first_n + ".");
        }

        if (second_n > first_n && second_n > third_n)
        {
            System.out.print("The largest number is " + second_n + ".");
        }

        if (third_n > first_n && third_n > second_n)
        {
            System.out.print("The largest number is " + third_n + ".");
        }

    }
}
