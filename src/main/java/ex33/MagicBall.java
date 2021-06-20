/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 jiahaoZhu
 */
package ex33;
import java.util.Scanner;

public class MagicBall {
    public static void main(String[] args) {
        System.out.println("What's your question?");
        String[] key = {"Yes","No","Maybe","Ask again later"};
        String random = "";
        int index =(int)(Math.random()*key.length);
        random = key[index];
        Scanner scan = new Scanner(System.in);
        String answer = scan.nextLine();
        System.out.println(random);
    }
}
