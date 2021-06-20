
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */
package ex38;
import java.util.Scanner;

public class FilteringValues {
    public static void main(String[] args) {
        System.out.println("Enter a list of numbers, separated by spaces:");
        Scanner scan = new Scanner(System.in);
        String user_input = scan.nextLine();
        String delimeter = " ";
        String[]split_input = user_input.split(delimeter);
        int[] arr = new int[split_input.length];
        for(int i = 0; i < split_input.length; i++)
        {
            arr[i] = Integer.parseInt(split_input[i].trim());
        }
        int[] even_array =filterEvenNumbers(arr);
        System.out.print("The even numbers are ");
        for(int i = 0; i <even_array.length; i++)
        {
            System.out.print(even_array[i]+" ");
        }
    }
    public static int[] filterEvenNumbers(int[] array)
    {
        int count = 0;
        for(int i = 0; i < array.length; i++)
        {
            if(array[i] % 2 == 0)
            {
                count ++;
            }
        }
        int[] new_array = new int[count];
        count = 0;
        for(int i = 0; i < array.length; i++)
        {
            if(array[i] % 2 == 0)
            {
                new_array[count] = array[i];
                count ++;
            }
        }
        return new_array;
    }
}

