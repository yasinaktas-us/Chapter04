package chapter04.Listings;

import java.util.Scanner;

public class Listing04_02_OrderTwoCities {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first city:");
        String city1 = input.nextLine();

        System.out.println("Enter the second city:");
        String city2 = input.nextLine();

        System.out.print("The cities alphabetical order are ");

        if (city1.compareTo(city2)<0) {
            System.out.println(city1+" ---> "+city2);
        } else
            System.out.println(city2+" ---> "+city1);



    }
}
