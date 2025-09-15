package chapter04.Exercises;

import java.util.Scanner;

public class Exercise04_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter point 1 (latitude and longitude) in degrees: ");
        double latitude1 = input.nextDouble();
        double longitude1 = input.nextDouble();

        System.out.println("Enter point 2 (latitude and longitude) in degrees: ");
        double latitude2 = input.nextDouble();
        double longitude2 = input.nextDouble();

        double radLat1 = Math.toRadians(latitude1);
        double radLong1 = Math.toRadians(longitude1);
        double radLat2 = Math.toRadians(latitude2);
        double radLong2 = Math.toRadians(longitude2);

        final double RADIUS = 6371.01;
        double distance = RADIUS * (Math.acos(Math.sin(radLat1) * (Math.sin(radLat2)) + (Math.cos(radLat1)) * (Math.cos(radLat2)) * (Math.cos(radLong1 - radLong2))));

        System.out.println("The distance between the two points is: " + distance + "km");
    }
}
