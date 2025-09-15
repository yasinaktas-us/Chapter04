package chapter04.Exercises;

import java.util.Scanner;

public class Exercise04_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter two character: ");
        String student = input.next().toUpperCase();

        char major = student.charAt(0);
        char status = student.charAt(1);

        switch (major){
            case 'M': System.out.print("Mathematics "); break;
            case 'C': System.out.print("Computer Science "); break;
            case 'I': System.out.print("Information Technology "); break;
            default: System.out.println("invalid input!");
            System.exit(0);
        }
        switch (status){
            case '1': System.out.println("Freshman"); break;
            case '2': System.out.println("Sophomore"); break;
            case '3': System.out.println("Junior"); break;
            case '4': System.out.println("Senior"); break;
            default: System.out.println("invalid input!");
                System.exit(1);
        }


    }
}
