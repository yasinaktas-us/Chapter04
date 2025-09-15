package chapter04.Exercises;

import java.util.Random;

public class Exercise04_25 {
    public static void main(String[] args) {

        int randomLetter1 = (65+(int)(Math.random()*25));
        int randomLetter2 = (65+(int)(Math.random()*25));
        int randomLetter3 = (65+(int)(Math.random()*25));

        int randomDigits = (1000+(int)(Math.random()*9000));

        System.out.println("Your Vehicle Plate \n" +
                ""+(char)randomLetter1+(char)randomLetter2+(char)randomLetter3+" * "+randomDigits);

    }
}
