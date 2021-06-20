/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 jiahaoZhu
 */
package ex29;
import java.util.Scanner;

public class badInput {
    public static void main(String[] args) {
        System.out.println("What is the rate of return?");
        isDilg();

    }
    public static void isDilg(){
        Scanner scan = new Scanner(System.in);
        do{
            if (!scan.hasNextInt())
            {
                System.out.println("Sorry. That's not a valid input.");
                isDilg();
            }else{
                int rate = scan.nextInt();
                if(rate > 0)
                {
                    rate = 72/rate;
                    System.out.println("It will take "+ rate +"  years to double your initial investment");
                }
            }
        }while(true);
    }
}
