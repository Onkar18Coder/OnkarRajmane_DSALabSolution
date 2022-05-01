package com.question1;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static BalancingBrackets balancingBrackets = new BalancingBrackets();

    public static void main(String[] args) {
        System.out.print("Enter String: ");
        String bracketsString = sc.nextLine();

        if ( balancingBrackets.IsBalanced(bracketsString) )
            System.out.println("The entered String has Balanced Brackets");
        else
            System.out.println("The entered Strings do not contain Balanced Brackets");
    }
}