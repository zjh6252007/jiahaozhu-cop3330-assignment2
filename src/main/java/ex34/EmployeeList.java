/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 jiahaoZhu
 */
package ex34;
import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeList {
    public static void main(String[] args) {
        ArrayList<String> employee = new ArrayList<>();
        employee.add("John Smith");
        employee.add("Jackie Jackson");
        employee.add("Chris Jones");
        employee.add("Amanda Cullen");
        employee.add("Jeremy Goodwin");
        System.out.println("There are "+employee.size()+" employees");

        for(String temp:employee)
        {
            System.out.println(temp);
        }
        System.out.println("Enter an employee name to remove:");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        for(int i = 0 ; i < employee.size(); i ++)
        {
            if(employee.get(i).equals(name))
            {
                employee.remove(i);
                i --;
            }
        }
        System.out.println("There are " + employee.size() + " employees");
        for(String temp : employee)
        {
            System.out.println(temp);
        }
    }
}
