/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 jiahaoZhu
 */
package ex26;
import java.util.Scanner;

public class PaymentCalculator {
    public static void main(String[] args) {
        System.out.println("What is your balance?");
        Scanner scan = new Scanner(System.in);
        double balance = scan.nextDouble();
        System.out.println("What is the APR on the card(as a percent)?");
        double apr = scan.nextDouble();
        apr /= 100;
        System.out.println("What is the monthly payment you can make?");
        double payment = scan.nextDouble();
        double month = calculateMonthsUntilPaidOff(apr,payment,balance,apr/365);
        System.out.println("It will take you "+month+" months to pay off this card");
    }
    public static double calculateMonthsUntilPaidOff(double apr,double payment,double balance,double dailyrate)
    {
        double month = (log(1+ (balance/payment)*(1-Math.pow((1+dailyrate),30)),10)/(log((1+dailyrate),10)))/-30;
        return Math.ceil(month);
    }
    public static double log(double value, double base)
    {
        return Math.log(value)/Math.log(base);
    }
}

