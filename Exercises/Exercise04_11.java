package chapter04.Exercises;

import java.util.Scanner;

public class Exercise04_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a decimal value (0 o 15): ");
        int decimal = input.nextInt();

        if (decimal<10) {
            System.out.println("The hex value is "+decimal);
        } else if (10<decimal) {
            System.out.println("The hex value is "+(char)((decimal-10)+'A'));
        } else if (15<decimal) {
            System.out.println("Invalid input");
        }
    }
}
