package chapter04.Exercises;

import java.util.Scanner;

public class Exercise04_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first 9 digits of an ISBN as integer: ");

        String isbn= input.nextLine();
        int isbnFirstNine = Integer.parseInt(isbn);

        int remainingNumber;

        int d9 = isbnFirstNine % 10;
        remainingNumber = isbnFirstNine / 10;
        int d8 = remainingNumber % 10;
        remainingNumber = remainingNumber / 10;
        int d7 = remainingNumber % 10;
        remainingNumber = remainingNumber / 10;
        int d6 = remainingNumber % 10;
        remainingNumber = remainingNumber / 10;
        int d5 = remainingNumber % 10;
        remainingNumber = remainingNumber / 10;
        int d4 = remainingNumber % 10;
        remainingNumber = remainingNumber / 10;
        int d3 = remainingNumber % 10;
        remainingNumber = remainingNumber / 10;
        int d2 = remainingNumber % 10;
        remainingNumber = remainingNumber / 10;
        int d1 = remainingNumber % 10;
        remainingNumber = remainingNumber / 10;

        int d10 = ((d1 * 1) + (d2 * 2) + (d3 * 3) + (d4 * 4) + (d5 * 5) + (d6 * 6) + (d7 * 7) + (d8 * 8) + (d9 * 9)) % 11;

        if (d10 == 10)
            System.out.println("The ISBN-10 number is " + isbnFirstNine + "X");
        else
            System.out.println("The ISBN-10 number is " + isbnFirstNine + d10);
    }

}
