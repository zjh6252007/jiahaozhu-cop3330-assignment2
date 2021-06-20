/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 jiahaoZhu
 */
package ex27;
import java.util.Scanner;

public class validatingInputs {
    public static final String zip = "^(?=.*[0-9]).{5}$";
    public static final String employeeID = "^[A-Z]{2}[-][0-9]{4}";
    public static void main(String[] args) {
        String fname,lname,zipcode,employeeID;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first name:");
        fname = scan.nextLine();
        System.out.println("Enter the last name:");
        lname = scan.nextLine();
        System.out.println("Enter the ZIP code:");
        zipcode = scan.nextLine();
        System.out.println("Enter the employee ID:");
        employeeID = scan.nextLine();
        validateInput(fname,lname,zipcode,employeeID);
    }

    public static boolean fnameCheck(String name) {
        if (name.length() < 2) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean lnameCheck(String name) {
        if (name.length() < 2) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean zipCheck(String zipcode)
    {
        if (zipcode.matches(zip))
        {
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean idCheck(String ID)
    {
        if(ID.matches(employeeID))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void validateInput(String fname,String lname,String zipcode,String ID)
    {
        boolean checkfname = fnameCheck(fname);
        boolean checklname = lnameCheck(lname);
        boolean checkzip = zipCheck(zipcode);
        boolean checkid = idCheck(ID);

        if(checkfname && checklname && checkzip && checkid)
        {
            System.out.print("There were no errors found.");
        }
        if(!checkfname)
        {
            System.out.println("The first name must be at least 2 characters long.");
        }
        if(!checklname)
        {
            System.out.println("The last name must be at least 2 characters long.");
        }
        if(!checkid)
        {
            System.out.println("The employee ID must be in the format of AA-1234.");
        }
        if(!checkzip)
        {
            System.out.println("The zipcode must be a 5 digit number.");
        }
    }
}
