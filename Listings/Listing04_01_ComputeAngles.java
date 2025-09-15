package chapter04.Listings;

import java.util.Scanner;

public class Listing04_01_ComputeAngles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter three point");

        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        double x3 = input.nextDouble();
        double y3 = input.nextDouble();

        //Compute Sides
        double sideA = Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3));
        double sideB = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));
        double sideC = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));

        //Compute Angles
        double angleA= Math.toDegrees(Math.acos(((sideA*sideA)-(sideB*sideB)-(sideC*sideC))/(-2*sideB*sideC)));
        double angleB= Math.toDegrees(Math.acos(((sideB*sideB)-(sideA*sideA)-(sideC*sideC))/(-2*sideA*sideC)));
        double angleC= Math.toDegrees(Math.acos(((sideC*sideC)-(sideB*sideB)-(sideA*sideA))/(-2*sideA*sideB)));

        double sumAngles=angleA+angleB+angleC;

        System.out.println("The three angles are: \n"+
                "Angle A: "+Math.round(angleA)+" \n"+
        "Angle B: "+Math.round(angleB)+" \n"+
        "Angle C: "+Math.round(angleC)+" \n");
        System.out.println("The sum of the angles of the triangle: " +(int)(sumAngles*100)/100.0);

    }
}
