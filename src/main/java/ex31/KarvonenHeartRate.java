/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 jiahaoZhu
 */
package ex31;
import java.util.Scanner;

public class KarvonenHeartRate {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        int restingHR,age;
        Scanner scan =new Scanner(System.in);
        System.out.println("Please enter the Resting Pulse");
        restingHR = scan.nextInt();
        System.out.println("Please enter the age");
        age = scan.nextInt();

        System.out.println("Resting Pulse: " + restingHR + " Age: " + age);

        double intensity = 0.55;
        System.out.println("Intensity | Rate ");
        System.out.println("------------------------");

        for(double i = 0.55; i < 1; i+= 0.05){
            double Target = (((220 - age) - restingHR) * i) + restingHR;
            System.out.println((int)(i*100)+"%       | "+(int)(Target) +"bpm");
        }
    }
}
