/**
 * 
 */
/**
 * 
 */
package lab03_Poker;

import java.util.Scanner;

public class Poker {
    
    // Scanner object for input
    Scanner input = new Scanner(System.in);
    private char choose = ' ';  				// Character to control the loop
    private String result = ""; 				// String to store the result
    // Arrays representing the card values and suits
    final private String[] Card = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };
    final private String[] Color = { "Club", "Diamond", "Heart", "Spade" };
    
    // Getter for result
    public String getResult() {
        return this.result;
    }

    // Setter for result
    public void setResult(String string) {
        this.result = string;
    }

    // Method to print the result
    public void print() {
        System.out.print(getResult());
    }
    
    // Constructor of the Poker class
    public Poker() {
        do {
            // Asking the user to enter a card number
            System.out.println("Enter Card Number (1-52): ");
            int number = input.nextInt(); 		// Read the input number
            input.nextLine();             		// Consume the newline character

            // Check if the number is within valid range
            if (number < 1 || number > 52) {
                System.out.println("Invalid Card Number!");
                continue;
            }

            // Determine the card and its suit based on the input number
            if (number >= 1 && number <= 13) {
                setResult("The card you picked is " + Card[(number - 1)] + " of " + Color[0]);
            } else if (number >= 14 && number <= 26) {
                setResult("The card you picked is " + Card[(number - 14)] + " of " + Color[1]);
            } else if (number >= 27 && number <= 39) {
                setResult("The card you picked is " + Card[(number - 27)] + " of " + Color[2]);
            } else if (number >= 40 && number <= 52) {
                setResult("The card you picked is " + Card[(number -  40)] + " of " + Color[3]);
			}
			print();	// Display the result
	        // Prompt user for continuing or exiting the program
	        System.out.println("\n\nEnter 'E' or 'e' to exit, otherwise press any key to recalculate.");
	        choose = input.next().toUpperCase().charAt(0); 		// Read the choice and convert to uppercase
	        
	    } while (choose != 'E'); 								// Continue until 'E' is entered
	    System.out.println("Thank for use, Bye Bye!"); 			// Exit message
	    input.close(); // Close the scanner
	}

	public static void main(String[] args) {
	    Poker poker = new Poker(); 								// Create an instance of Poker class
	}
}