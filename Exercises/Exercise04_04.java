package chapter04.Exercises;

import java.util.Scanner;

public class Exercise04_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the side: ");
        double side = input.nextDouble();

        double area = (6*side*side)/(4*(Math.tan(3.14/6)));

        System.out.println("The area of the hexagon: "+(int)(area*100)/100.0);
    }
}
