package chapter04.Exercises;

import java.util.Scanner;

public class Exercise04_15 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.println("Enter a letter: ");
        char letter = input.next().charAt(0);

        if(letter=='A' || letter=='a'|| letter=='B'|| letter=='b'|| letter=='C'|| letter=='c')
            System.out.println("The corresponding number is 2");
        else if(letter=='D' || letter=='d'|| letter=='E'|| letter=='e'|| letter=='F'|| letter=='f')
            System.out.println("The corresponding number is 3");
        else if(letter=='G' || letter=='g'|| letter=='H'|| letter=='h'|| letter=='I'|| letter=='i')
            System.out.println("The corresponding number is 4");

        /*
        *
        *
        * */

        else
            System.out.println(letter+ " is invalid input!!");
    }
}
