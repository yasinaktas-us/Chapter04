package chapter04.Listings;

import java.util.Scanner;

public class Listing04_04_HexDigit2Dec {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a hex digit: ");
        String hexDigit = input.nextLine().toUpperCase();

        if (hexDigit.length() != 1) {
            System.out.println("You must enter exactly one character!!!");
            System.exit(1);
        }
        char ch = hexDigit.charAt(0);
        if ('A' <= ch && ch <= 'F') {
            int value = ch - 'A'+10;
            System.out.println("The decimal value for hex digit "+ch+" is "+value);
        }else if (Character.isDigit(ch)){
            System.out.println("The decimal value for hex digit "+ch);
        }
        else
            System.out.println("Invalid input!!!");

    }
}
