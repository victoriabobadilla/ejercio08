/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication32;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class JavaApplication32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

		// Create constant value
		final double METERS_PER_FOOT = 0.305;

		// Prompt user to enter a number in feet
		System.out.print("Enter a value for feet: ");
		double feet = input.nextDouble();

		// Convert feet into meters
		double meters = feet * METERS_PER_FOOT;

		// Display results
		System.out.println(feet + " feet is " + meters + " meters");
    }
    
}
