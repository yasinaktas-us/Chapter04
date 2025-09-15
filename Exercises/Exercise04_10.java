package chapter04.Exercises;

import java.util.Scanner;

public class Exercise04_10 {
    public static void main(String[] args) {

        String set1 =
                " 1  3  5  7\n" +
                        " 9 11 13 15\n" +
                        "17 19 21 23\n" +
                        "25 27 29 31";
        String set2 =
                " 2  3  6  7\n" +
                        "10 11 14 15\n" +
                        "18 19 22 23\n" +
                        "26 27 30 31";

        String set3 =
                " 4  5  6  7\n" +
                        "12 13 14 15\n" +
                        "20 21 22 23\n" +
                        "28 29 30 31";

        String set4 =
                " 8  9 10 11\n" +
                        "12 13 14 15\n" +
                        "24 25 26 27\n" +
                        "28 29 30 31";

        String set5 =
                "16 17 18 19\n" +
                        "20 21 22 23\n" +
                        "24 25 26 27\n" +
                        "28 29 30 31";

        int day = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Is your birthday in set1? ");
        System.out.print(set1);
        System.out.println("\n\nEnter 'N' for 'NO'\n"+
                "Enter 'Y' for 'YES'");

        String str1 = input.next().toUpperCase();
        char answer = str1.charAt(0);

        if(answer=='Y')
            day = day + 1;

        System.out.println("Is your birthday in set2? ");
        System.out.print(set2);
        System.out.println("\n\nEnter 'N' for 'NO'\n"+
                "Enter 'Y' for 'YES'");

        String str2 = input.next().toUpperCase();
        char answer2 = str2.charAt(0);

        if(answer2=='Y')
            day = day + 2;

        System.out.println("Is your birthday in set3? ");
        System.out.print(set3);
        System.out.println("\n\nEnter 'N' for 'NO'\n"+
                "Enter 'Y' for 'YES'");

        String str3 = input.next().toUpperCase();
        char answer3 = str3.charAt(0);

        if(answer3=='Y')
            day = day + 4;

        System.out.println("Is your birthday in set4? ");
        System.out.print(set4);
        System.out.println("\n\nEnter 'N' for 'NO'\n"+
                "Enter 'Y' for 'YES'");

        String str4 = input.next().toUpperCase();
        char answer4 = str4.charAt(0);

        if(answer4=='Y')
            day = day + 8;

        System.out.println("Is your birthday in set5? ");
        System.out.print(set5);
        System.out.println("\n\nEnter 'N' for 'NO'\n"+
                "Enter 'Y' for 'YES'");

        String str5 = input.next().toUpperCase();
        char answer5 = str5.charAt(0);

        if(answer5=='Y')
            day = day + 16;

        System.out.println("Your Birthday Is " + day + "!!!");
    }

}
