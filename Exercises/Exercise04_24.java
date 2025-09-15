package chapter04.Exercises;

import java.util.Scanner;

public class Exercise04_24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first city:");
        String city1 = input.nextLine();

        System.out.println("Enter the second city:");
        String city2 = input.nextLine();

        System.out.println("Enter the third city:");
        String city3 = input.nextLine();

        System.out.println("The three cities in alphabetic order are :\n");

        if (city1.compareTo(city2) < 0 && city1.compareTo(city3) < 0) {
            if (city2.compareTo(city3) < 0)
                System.out.println(city1 + "--->" + city2 + "--->" + city3);
            else
                System.out.println(city1 + "--->" + city3 + "--->" + city2);
        } else if (city2.compareTo(city1) < 0 && city2.compareTo(city3) < 0) {
            if (city1.compareTo(city3) < 0)
                System.out.println(city2 + "--->" + city1 + "--->" + city3);
            else
                System.out.println(city2 + "--->" + city3 + "--->" + city1);
        } else if (city3.compareTo(city1) < 0 && city3.compareTo(city2) < 0) {
            if (city1.compareTo(city2) < 0)
                System.out.println(city3 + "--->" + city1 + "--->" + city2);
            else
                System.out.println(city3 + "--->" + city2 + "--->" + city1);

        }
    }
}
