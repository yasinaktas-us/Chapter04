package chapter04.Exercises;

import java.util.Scanner;

public class Exercise04_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a SSN: ");
        String ssn = input.nextLine();

        int hyphen = ssn.indexOf('-');
        int hyphen2 = ssn.lastIndexOf('-');


        if (hyphen==3 && hyphen2 ==6 && ssn.length()==11) {
            System.out.println(ssn+" is a valid Social Security Number: ");

        } else
            System.out.println(ssn+" is a invalid Social Security Number: ");

    }
}
