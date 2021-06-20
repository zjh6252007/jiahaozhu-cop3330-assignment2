/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 jiahaoZhu
 */
package ex30;
public class multiplicationTable {
    public static void main(String[] args) {
        int [][] multtable = new int[12][12];
        for(int i = 0 ; i < 12 ; i++)
        {
            for(int j = 0 ; j < 12 ; j++)
            {
                multtable[i][j] = (i+1) * (j+1);
                System.out.printf("%4d",multtable[i][j]);
            }
            System.out.println("");
        }
    }
}
