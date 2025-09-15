package chapter04.Exercises;

import java.util.Scanner;

public class Exercise04_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a year: ");
        int year = input.nextInt();

        System.out.print("Enter a month: ");
        String month = input.next();

        if (month.contains("Jan") || month.contains("Mar") || month.contains("May") || month.contains("Jul") || month.contains("Aug") || month.contains("Oct") || month.contains("Dec")) {
            System.out.println(month + " " + year + " has 31 days");

        } else if (month.contains("Feb") ) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(month + " " + year + " has 29 days");

            } else
                System.out.println(month + " " + year + " has 28 days");

        } else
        System.out.println(month + " " + year + " has 30 days");

    }
}
