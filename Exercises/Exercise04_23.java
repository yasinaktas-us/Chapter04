package chapter04.Exercises;

import java.util.Scanner;

public class Exercise04_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print(" Enter employee's name: ");
        String employee = input.nextLine();
        System.out.print(" Enter number of hours worked in a week: ");
        int hour = input.nextInt();
        System.out.print(" Enter hourly pay rate: ");
        double payRate = input.nextDouble();
        System.out.print(" Enter federal tax withholding rate: ");
        double federalRate = input.nextDouble();
        System.out.print(" Enter state tax withholding rate: ");
        double stateRate = input.nextDouble();

        double grossPay = hour * payRate;

        double federalTax = grossPay * federalRate;
        double stateTax = grossPay * stateRate;
        double totalTax = federalTax + stateTax;

        double totalPay = grossPay - totalTax;

        System.out.println("Employee Name: $" + employee + "\n" +
                "Hours Worked: $" + hour + "\n" +
                "Pay Rate: $" + payRate + "\n" +
                "Gross Pay: $" + grossPay);
        System.out.println("Deductions: \n" +
                "  Federal Withholding (" + federalRate * 100 + "%): " + federalTax + "\n" +
                "  State Withholding (" + stateRate * 100 + "%): " + stateTax + "\n" +
                "  Total Deduction: $" + totalTax + "\n" +
                "Net Pay: $" + totalPay);

    }
}
