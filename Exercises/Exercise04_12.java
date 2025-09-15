package chapter04.Exercises;

import java.util.Scanner;

public class Exercise04_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a Hex digit: ");
        String digit = input.next().toUpperCase();
        char hex = digit.charAt(0);

        if (digit.length() != 1) {
            System.out.println("You must enter exactly one character!!!");
            System.exit(1);
        }

        if ('A' <= hex && hex <= 'F') {
            int decimal = hex - 'A' + 10;
            System.out.println("The binary value: " + Integer.toBinaryString(decimal));
        } else {
            int decimal = Integer.parseInt(digit);
            System.out.println("The binary value: " + Integer.toBinaryString(decimal));
        }
    }
}
