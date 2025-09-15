package chapter04.Exercises;

import java.util.Scanner;

public class Exercise04_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a any string: ");
        String str = input.nextLine();

        System.out.println("Length of String: "+str.length());
        System.out.println("The first char of String: "+str.charAt(0));
    }
}
