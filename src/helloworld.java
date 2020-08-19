import java.util.Scanner;

public class helloworld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String password = "hello123";
		int attempts = 0;

		Scanner input = new Scanner(System.in);

		while (true) {
			System.out.print("Enter password: ");

			String passwordInput = input.nextLine();

			if (password.equals(passwordInput)) {
				System.out.println("The password you entered is correct.");
				System.out.println("");
				break;
			} else {
				System.out.println("The password you entered is incorrect.");
				System.out.println("");

				attempts++;

				if (attempts == 3) {
					System.out.println("Maximum amount of attempts reached");
					break;
				}
			}
		}

		input.close();
	}

}
