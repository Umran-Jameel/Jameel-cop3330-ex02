/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Umran Jameel
 */

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args)
    {
        System.out.print("What is the input string? ");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        int len = str.length();
        System.out.printf("%s has %d characters.", str, len);
    }
}
