import java.util.Scanner;

public class helloworld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String password = "hello123";
		int attempts = 0; // Number of attempts. Increased if user enters an incorrect password

		Scanner input = new Scanner(System.in);

		while (true) { // Start the loop that checks if the password is correct. If incorrect, ask again
			System.out.print("Enter password: ");

			String passwordInput = input.nextLine();

			if (password.equals(passwordInput)) { // If password is correct, print the message and end the loop
				System.out.println("The password you entered is correct.");
				System.out.println("");
				break;
			} else { // If incorrect, print the message, increase the number of attempts, then check if the user has attempted to enter 3 times and end the loop
				System.out.println("The password you entered is incorrect.");
				System.out.println("");

				attempts++;

				if (attempts == 3) {
					System.out.println("Maximum amount of attempts reached.");
					break;
				}
			}
		}

		input.close();
	}

}
