package chapter04.Exercises;

import java.util.Scanner;

public class Exercise04_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final double RADIUS = 6371.01;

        //System.out.print("Atlanta : (33.7489954, –84.3879824)");
        //double atlantaX1=input.nextDouble();
        //double atlantaY1=input.nextDouble();


        //System.out.print("Orlando : (28.5383355, –81.3792365)");
        //double orlandoX2=input.nextDouble();
        //double orlandoY2=input.nextDouble();
        //System.out.print("Savannah (32.0835407, –81.0998342)");
        //double savannahX3=input.nextDouble();
        //double savannahY3=input.nextDouble();
        //System.out.print("Charlotte (35.2270869, –80.8431267)");
        //double charlotteX4=input.nextDouble();
        //double charlotteY4=input.nextDouble();


        double atlantaX1 = 33.7489;
        double atlantaY1 = -84.3879;
        double orlandoX2 = 28.5383;
        double orlandoY2 = -81.3792;
        double savannahX3 = 32.0835;
        double savannahY3 = -81.0998;
        double charlotteX4 = 35.2270;
        double charlotteY4 = -80.8431;


        // find to from atlanta to orlando

        double disATLtoORL = RADIUS * (Math.acos(Math.sin(Math.toRadians(atlantaX1)) * (Math.sin(Math.toRadians(orlandoX2))) + (Math.cos(Math.toRadians(atlantaX1))
                * (Math.cos(Math.toRadians(orlandoX2))) * (Math.cos((Math.toRadians(atlantaY1)) - (Math.toRadians(orlandoY2)))))));

        // find to from orlando to savannah

        double disORLtoSAV = RADIUS * (Math.acos(Math.sin(Math.toRadians(orlandoX2)) * (Math.sin(Math.toRadians(savannahX3))) + (Math.cos(Math.toRadians(orlandoX2)))
                * (Math.cos(Math.toRadians(savannahX3))) * (Math.cos((Math.toRadians(orlandoY2)) - (Math.toRadians(savannahY3))))));

        // find to from savannah to charlotte

        double disSAVtoCHR = RADIUS * (Math.acos(Math.sin(Math.toRadians(savannahX3)) * (Math.sin(Math.toRadians(charlotteX4))) + (Math.cos(Math.toRadians(savannahX3)))
                * (Math.cos(Math.toRadians(charlotteX4))) * (Math.cos((Math.toRadians(savannahY3)) - (Math.toRadians(charlotteY4))))));

        // find to from charlotte to atlanta

        double disCHRtoATL = RADIUS * (Math.acos(Math.sin(Math.toRadians(charlotteX4)) * (Math.sin(Math.toRadians(atlantaX1))) + (Math.cos(Math.toRadians(charlotteX4)))
                * (Math.cos(Math.toRadians(atlantaX1))) * (Math.cos((Math.toRadians(charlotteY4)) - (Math.toRadians(atlantaY1))))));

        // find to from atlanta to savannah
        // It was used to divide the rectangle into two triangles.

        double disATLtoSAV = RADIUS * (Math.acos(Math.sin(Math.toRadians(atlantaX1)) * (Math.sin(Math.toRadians(savannahX3))) + (Math.cos(Math.toRadians(atlantaX1))
                * (Math.cos(Math.toRadians(savannahX3))) * (Math.cos((Math.toRadians(atlantaY1)) - (Math.toRadians(savannahY3)))))));

        // triangle of [atlanta --> orlando --> savannah]

        //double area = Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);
        double firstDistance = (disATLtoORL + disORLtoSAV + disATLtoSAV) / 2;
        double firstTriangleArea = Math.pow(firstDistance * (firstDistance - disATLtoORL) * (firstDistance - disORLtoSAV) * (firstDistance - disATLtoSAV), 0.5);

        // triangle of [atlanta --> savannah --> charlotte]

        double secondDistance = (disATLtoSAV + disSAVtoCHR + disCHRtoATL) / 2;
        double secondTriangleArea = Math.pow(secondDistance * (secondDistance - disATLtoSAV) * (secondDistance - disSAVtoCHR) * (secondDistance - disCHRtoATL), 0.5);

        double area = firstTriangleArea+secondTriangleArea;

        System.out.println("Area of Atlanta-Orlando-Savannah-Charlotte : " +area+" km2!");
    }
}
