package chapter04.Exercises;

public class Exercise04_06 {
    public static void main(String[] args) {


        // point 1

        double randomAngle1 = ((int) (Math.random() * (360)));

        double pointX1 = 40 * Math.cos(Math.toRadians(randomAngle1));
        double pointY1 = 40 * Math.sin(Math.toRadians(randomAngle1));


        // point 2

        double randomAngle2 = ((int) (Math.random() * (360)));

        double pointX2 = 40 * Math.cos(Math.toRadians(randomAngle2));
        double pointY2 = 40 * Math.sin(Math.toRadians(randomAngle2));

        // point 3

        double randomAngle3 = ((int) (Math.random() * (360)));

        double pointX3 = 40 * Math.cos(Math.toRadians(randomAngle3));
        double pointY3 = 40 * Math.sin(Math.toRadians(randomAngle3));

    }
}
