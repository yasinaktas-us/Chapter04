package chapter04.Exercises;

import java.util.Scanner;

public class Exercise04_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an ASCII code:");
        int code = input.nextInt();

        char ascii = (char) code;

        System.out.println("The character for ASCII code " + code + " is " + ascii);

    }
}
