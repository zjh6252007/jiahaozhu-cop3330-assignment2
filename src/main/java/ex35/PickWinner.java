/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 jiahaoZhu
 */
package ex35;
import java.util.ArrayList;
import java.util.Scanner;

public class PickWinner {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        String key;
        do {
            System.out.println("Enter a name：");
            key = scan.nextLine();
            name.add(key);
        }while (!key.equals(""));
        name.remove(name.size()-1);
        String random ="";
        int index = (int)(Math.random()*(name.size()));
        random = name.get(index);
        System.out.println("The winner is ..." + random);
    }
}
