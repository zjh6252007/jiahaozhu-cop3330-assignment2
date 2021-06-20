/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 jiahaoZhu
 */
package ex24;
import java.util.Scanner;

public class AnagramChecker {
    public static void main(String[] args) {
        Anagram ang = new Anagram();
        System.out.println("Enter two strings and I'II tell you if they are anagrams:");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first string:");
        String string1 = scan.nextLine();
        System.out.println("Enter the second string:");
        String string2 = scan.nextLine();
        boolean answer = ang.isAnagram(string1,string2);
        if(answer)
        {
            System.out.println("\""+ string1 +"\" and \"" + string2 +"\" are anagrams.");
        }
        else
        {
            System.out.println("\""+ string1 +"\" and \"" + string2 +"\" are not anagrams.");

        }
    }
}
