/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 jiahaoZhu
 */
package ex32;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;


public class guessNumber {
    public static void main(String[] args) {
        System.out.println("Let's play Guess the Number!");
        diffSelect();
    }

    public static void diffSelect() {
        System.out.println("Enter the difficulty level 1,2, or 3");
        Scanner scan = new Scanner(System.in);
        int difficult;
        boolean quit = true;
        label:
        while (true) {
            difficult = scan.nextInt();
            switch (difficult) {
                case 1:
                    guess(10);
                    break label;
                case 2:
                    guess(100);
                    break label;
                case 3:
                    guess(1000);
                    break label;
                default:
                    System.out.println("Please enter 1,2, or 3.");
            }
        }
    }

    private static int numberCheck()
    {
        try{
            Scanner scan = new Scanner(System.in);
            int number = scan.nextInt();
            return number;
        }catch (InputMismatchException e)
        {
            System.out.println("Please enter a valid number");
            return numberCheck();
        }
    }
    public static void guess (int range)
    {
        Random r = new Random();
        System.out.println("I have my number. What's your guess");
        int key = r.nextInt(range);
        Scanner scan = new Scanner(System.in);
        int answer;
        int count = 0;
        do{
            answer = numberCheck();

            if(answer > key)
            {
                System.out.println("Too high");
            }
            if(answer < key)
            {
                System.out.println("Too low");
            }
            count ++;
        }while(answer != key);
        System.out.println("You got it in "+ count +" guesses!\n\nDo you wish to play again(Y/N)?");
        String diff;
        boolean quit = true;
        while(quit)
        {
            diff = scan.nextLine();
            switch(diff){
                case "y":diffSelect();
                case "n":quit = false;
                break;
                default:System.out.println("Please enter Y/N");
            }
        }
    }
}
