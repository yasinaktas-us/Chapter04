package chapter04.Exercises;

import java.util.Scanner;

public class Exercise04_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a letter grade: ");
        String letter = input.nextLine().toUpperCase();
        char ch = letter.charAt(0);

        switch (ch){
            case 'A': System.out.print("The numeric value for grade " +ch+" is "+4);break;
            case 'B': System.out.print("The numeric value for grade " +ch+" is "+3);break;
            case 'C': System.out.print("The numeric value for grade " +ch+" is "+2);break;
            case 'D': System.out.print("The numeric value for grade " +ch+" is "+1);break;
            case 'F': System.out.print("The numeric value for grade " +ch+" is "+0);break;

            default:
                System.out.println(ch +"is invalid grade");
        }
    }
}
