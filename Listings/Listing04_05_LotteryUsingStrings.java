package chapter04.Listings;

import java.util.Scanner;

public class Listing04_05_LotteryUsingStrings {
    public static void main(String[] args) {
        String lottery = (""+(int) (Math.random() * 10)) + ((int) (Math.random() * 10));

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your lucky number (two digit): ");
        String lucky = input.nextLine();

        char lotteryDigit1 = lottery.charAt(0);
        char lotteryDigit2 = lottery.charAt(1);

        char luckyDigit1 = lucky.charAt(0);
        char luckyDigit2 = lucky.charAt(1);

        System.out.println("The winning number is " + lottery);

        if (lottery == lucky) {
            System.out.println("\n *****JACKPOT!!!! YOU WIN $10 000****");
        } else if (luckyDigit1 == lotteryDigit2 && luckyDigit2 == lotteryDigit1) {
            System.out.println("Congrats!! You win $3 000 ");
        } else if (luckyDigit1 == lotteryDigit1 || luckyDigit1 == lotteryDigit2 || luckyDigit2 == lotteryDigit1 || luckyDigit2 == lotteryDigit2) {
            System.out.println("You win $1 000");
        } else
            System.out.println("Sorry :( No match");


    }
}
