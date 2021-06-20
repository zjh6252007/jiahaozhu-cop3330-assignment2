/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 jiahaoZhu
 */
package ex24;
import java.util.Scanner;

public class AnagramChecker {
    public static void main(String[] args) {
        System.out.println("Enter two strings and I'II tell you if they are anagrams:");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first string:");
        String string1 = scan.nextLine();
        System.out.println("Enter the second string:");
        String string2 = scan.nextLine();
        boolean answer = isAnagram(string1,string2);
        if(answer)
        {
            System.out.println("\""+ string1 +"\" and \"" + string2 +"\" are anagrams.");
        }
        else
        {
            System.out.println("\""+ string1 +"\" and \"" + string2 +"\" are not anagrams.");

        }
    }
    public static boolean isAnagram(String a,String b)
    {
        char[] temp = a.toCharArray();
        char[] temp2 = b.toCharArray();
        int count = 0;
        if (a.length() == b.length())
        {
            for(int i = 0; i < a.length(); i++)
            {
                for(int j = 0; j < b.length(); j++)
                {
                    if(temp[i] == temp2[j])
                    {
                        temp[i] = 0;
                        temp2[j] = 0;
                    }
                }
            }
            for(int i = 0; i < a.length(); i++)
            {
                if(temp[i] == 0)
                {
                    count ++;
                }
            }
            if(count == a.length())
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            return false;
        }
    }
}
