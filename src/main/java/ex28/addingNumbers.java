/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 jiahaoZhu
 */
package ex28;
import java.util.Scanner;

public class addingNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 0;
        int total = 0;
        for (int i = 0 ; i < 5; i ++)
        {
            System.out.println("Enter a number");
            count = scan.nextInt();
            total += count;
        }
        System.out.println("The total is " + total);
    }
}
