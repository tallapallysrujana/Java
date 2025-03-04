package com.kunal;

import java.util.Scanner;

public class Electricitybill {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        final double rateperkwh=0.10;
        System.out.println("Enter no.of kwh consumed: ");
        double consumption=sc.nextDouble();
        if(consumption<0){
            System.out.println("Consumption cant be negative");
        }
        else{
            double bill=consumption*rateperkwh;
            System.out.printf("The total electricity bill is: $%.2f%n",bill);
        }

    }

}
/*
import java.util.Scanner;

public class TieredElectricityBillCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define tiered rates (example rates in dollars per kWh)
        final double RATE1 = 0.10; // For first 100 kWh
        final double RATE2 = 0.15; // For next 150 kWh
        final double RATE3 = 0.20; // For consumption above 250 kWh

        // Prompt user for electricity consumption
        System.out.println("Enter the number of kWh consumed:");
        double consumption = scanner.nextDouble();

        double bill = 0;

        if (consumption < 0) {
            System.out.println("Consumption cannot be negative.");
        } else if (consumption <= 100) {
            bill = consumption * RATE1;
        } else if (consumption <= 250) {
            bill = (100 * RATE1) + ((consumption - 100) * RATE2);
        } else {
            bill = (100 * RATE1) + (150 * RATE2) + ((consumption - 250) * RATE3);
        }

        System.out.printf("The total electricity bill is: $%.2f%n", bill);

        scanner.close();
    }
}

 */
