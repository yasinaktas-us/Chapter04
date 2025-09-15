package chapter04.Exercises;

import java.util.Scanner;

public class Exercise04_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double PI = 3.141;

        System.out.print("Enter the number of sides: ");
        int side = input.nextInt();

        System.out.print("Enter the side: ");
        double length = input.nextDouble();

        double area = (side*length*length)/(4*(Math.tan(PI/side)));

        System.out.println("The area of the polygon is "+area);
    }
}
