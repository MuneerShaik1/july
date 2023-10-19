package controlStatements;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to reverse: ");
        int number = input.nextInt();
        int reversedNumber = reverseNumber(number);
        System.out.println("Reversed Number: " + reversedNumber);
    }

    public static int reverseNumber(int number) {
        int reversedNumber = 0;
        
        while (number != 0) {
            int digit = number % 10;
            
            reversedNumber = reversedNumber * 10 + digit;
            
            number =number/ 10;
        }
        return reversedNumber;
    }
}

