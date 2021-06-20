/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 jiahao zhu
 */
package ex36;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class computingStatistics {
    public static final String validword = "^([0-9]*|done)$";
    public static void main(String[] args) {
        ArrayList<String> num = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        String input;
        while(true)
        {
            System.out.println("Enter a number:");
            input = scan.nextLine();
            if(!input.matches(validword))
            {
                System.out.println("Please enter a valid number");
            }
            else if(input.matches(validword) && !input.equals("done"))
            {
                num.add(input);
            }
            else{
                break;
            }
        }
        num.remove(num.size()-1);
        System.out.println("The average is " + average(num));
        System.out.println("The minimum is " + min(num));
        System.out.println("The maximum is " + max(num));
        System.out.println("The standard deviation is " + standardDv(num));
    }
    public static double average(ArrayList<String> num) {
        double ave = 0;
        for (int i = 0; i < num.size(); i++) {
            int temp = Integer.valueOf(num.get(i));
            ave += temp;
        }
        ave /= num.size();
        return ave;
    }
    public static int max(ArrayList<String> num)
    {
        String temp;
        temp = num.get(0);
        int max = Integer.valueOf(temp);
        for(int i = 0 ; i < num.size(); i++)
        {
            int value = Integer.valueOf(num.get(i));
            if(max < value){
                max = value;
            }
        }
        return max;
    }
    public static int min(ArrayList<String> num)
    {
        String temp;
        temp = num.get(0);
        int min = Integer.valueOf(temp);
        for(int i = 0 ; i < num.size(); i++)
        {
            int value = Integer.valueOf(num.get(i));
            if(min > value){
                min = value;
            }
        }
        return min;
    }

    public static double standardDv(ArrayList<String> num)
    {
        double sum = 0.0;
        double standardDeviation = 0.0;
        double mean = 0.0;
        double res = 0.0;
        double sq = 0.0;
        for (int i = 0; i < num.size() ; i++) {
            int temp = Integer.valueOf(num.get(i));
            sum += + temp;
        }

        mean = sum / (num.size());

        for (int i = 0; i < num.size(); i++) {
            int temp = Integer.valueOf(num.get(i));
            standardDeviation += Math.pow((temp - mean), 2);
        }
        sq = standardDeviation / num.size();
        res = Math.sqrt(sq);
        return res;
    }
}
