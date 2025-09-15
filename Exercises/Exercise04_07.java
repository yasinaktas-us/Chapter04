package chapter04.Exercises;

import java.util.Scanner;

public class Exercise04_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of the bounding circle: ");
        int radius = input.nextInt();


        // point 1
        double randomAngle1 = ((int) (Math.random() * (360)));

        double pointX1 = radius * Math.cos(Math.toRadians(randomAngle1));
        double pointY1 = radius * Math.sin(Math.toRadians(randomAngle1));

        // point 2
        double randomAngle2 = ((int) (Math.random() * (360)));

        double pointX2 = radius * Math.cos(Math.toRadians(randomAngle2));
        double pointY2 = radius * Math.sin(Math.toRadians(randomAngle2));

        // point 3
        double randomAngle3 = ((int) (Math.random() * (360)));

        double pointX3 = radius * Math.cos(Math.toRadians(randomAngle3));
        double pointY3 = radius * Math.sin(Math.toRadians(randomAngle3));

        // point 4
        double randomAngle4 = ((int) (Math.random() * (360)));

        double pointX4 = radius * Math.cos(Math.toRadians(randomAngle4));
        double pointY4 = radius * Math.sin(Math.toRadians(randomAngle4));

        // point 5
        double randomAngle5 = ((int) (Math.random() * (360)));

        double pointX5 = radius * Math.cos(Math.toRadians(randomAngle5));
        double pointY5 = radius * Math.sin(Math.toRadians(randomAngle5));

        System.out.println("The coordinates of five points on the pentagon are \n" +
                "("+pointX1+", "+pointY1+")\n" +
                "("+pointX2+", "+pointY2+")\n" +
                "("+pointX3+", "+pointY3+")\n" +
                "("+pointX4+", "+pointY4+")\n" +
                "("+pointX5+", "+pointY5+")\n");

    }

}
