package UI;

import UI.PotentialEnergy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter the mass of the object in kg: ");
        double m = input.nextDouble();

        System.out.print("Enter the height of the object in meters: ");
        double h = input.nextDouble();

        // Calculate potential energy using the UI.PotentialEnergy class

        double PE = PotentialEnergy.calculatePotentialEnergy(m, h);

        // Output result
        System.out.println("The potential energy of the object is " + PE + " J");
    }
}
