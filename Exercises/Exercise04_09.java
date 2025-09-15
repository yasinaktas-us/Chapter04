package chapter04.Exercises;

import java.util.Scanner;

public class Exercise04_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a character: ");
        char ascii = input.next().charAt(0);

        int code = (int) ascii;

        System.out.println("The Unicode for the character " + ascii + " is " + code);
    }
}
