package module1;

import java.util.Scanner;

/**
 * 
 * @author Adeyemi Adeoye
 * This program receives the information of student from the 
 * command line, stores the information and then prints the 
 * information of the user to the console
 *
 */
public class StudentInfo {

	public static void main(String[] args) {
		// create a scanner to get input from the user
		Scanner studentScanner = new Scanner(System.in);
		
		// declare variables to hold student information
		String firstName;
		String lastName;
		String streetAddress;
		String city;
		String zip;
		String state;
		
		// collect student information
		System.out.println("Please enter student first name: ");
		firstName = studentScanner.nextLine();
		
		System.out.println("Please enter student last name: ");
		lastName = studentScanner.nextLine();
		
		System.out.println("Please enter student street address: ");
		streetAddress = studentScanner.nextLine();
		
		System.out.println("Please enter student city: ");
		city = studentScanner.nextLine();
		
		System.out.println("Please enter student zip: ");
		zip = studentScanner.nextLine();
		
		System.out.println("Please enter student state: ");
		state = studentScanner.nextLine();

		
		// output student information to console
		System.out.println("=================================");
		System.out.println("STUDENT ADDRESS");
		System.out.println("=================================");
		System.out.println("First Name: " + firstName);
		System.out.println("Last Name: " + lastName);
		System.out.println("Street Address: " + streetAddress);
		System.out.println("City: " + city);
		System.out.println("Zip Code: " + zip);
		System.out.println("State: " + state);
		System.out.println("=================================");
		
		// cleanup resources
		studentScanner.close();
		
		
	}

}
