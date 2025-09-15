package chapter04.Exercises;

import java.util.Scanner;

public class Exercise04_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a letter: ");
        String letter = input.next().toLowerCase();
        char ch = letter.charAt(0);

        if (letter.length() != 1) {
            System.out.println("You should enter one letter!!");
            System.exit(1);
        }
        if ('a' <= ch && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(letter + " is a vowel");
            } else
                System.out.println(letter + " is a consonant");
        } else
            System.out.println(letter + " is a invalid input");
    }
}
