/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 jiahao Zhu
 */
package ex37;
import java.util.*;

public class passwordGenator
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("What's the minimum length? ");
        int size = Integer.parseInt(scan.nextLine());
        System.out.print("How many special characters? ");
        int special = Integer.parseInt(scan.nextLine());
        System.out.print("How many numbers? ");
        int numbers = Integer.parseInt(scan.nextLine());
        System.out.println("Your password is " + generatePassword(size, special, numbers));
    }

    public static String generatePassword(int length, int special, int nums)
    {
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        String numbers = "1234567890";
        String specialCharacters = "!@#$%^&*";
        Random ran = new Random();

        ArrayList<Character> chars = new ArrayList<>();

        for(int i=0; i<special; i++){
            chars.add(specialCharacters.charAt(ran.nextInt(specialCharacters.length())));
        }

        for(int i=0; i<nums; i++){
            chars.add(numbers.charAt(ran.nextInt(numbers.length())));
        }

        for(int i=chars.size()-1; i<length; i++){
            chars.add(letters.charAt(ran.nextInt(letters.length())));
        }

        Collections.shuffle(chars);
        String password = "";
        for(Character s : chars)
        {
            password += Character.toString(s);
        }
        return password;
    }
}