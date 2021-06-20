/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 jiahaoZhu
 */
package ex25;
import java.util.Scanner;

public class password {
    public static final String weak = "^(?=.*[a-z])$";
    public static final String strong = "^(?=.*[a-z])(?=.*[0-9]).{8,}$";
    public static final String very_strong = "^(?=.*[a-z])(?=.*[0-9])(?=.*[!@#\\$%\\^&\\*]).{8,}$";
    public static void main(String[] args) {
        passwordValidator ps = new passwordValidator();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the password");
        String key = scan.nextLine();
        int strength = ps.Validator(key);
        switch(strength)
        {
            case 1:System.out.println("The password" + "'"+key+"' "+"is a very strong password");
                break;
            case 2:System.out.println("The password" + "'"+key+"' "+"is a strong password");
                break;
            case 3:System.out.println("The password" + "'"+key+"' "+"is a weak password");
                break;
            case 4:System.out.println("The password" + "'"+key+"' "+"is a very weak password");
            default:break;
        }
    }
}
