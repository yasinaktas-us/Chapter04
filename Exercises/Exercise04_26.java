package chapter04.Exercises;

import java.util.Scanner;

public class Exercise04_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a amount: ");
        String amount = input.nextLine();

        int point = amount.indexOf(".");

        String dollar = amount.substring(0,point);
        String cent = amount.substring(point+1);

       // int numberOfDollar= Integer.parseInt(dollar);
       // int numberOfCent=Integer.parseInt(cent);

        System.out.println("Your amount: \n" +
                dollar+ " dollar "+cent+" cent");
    }
}
