import java.util.Scanner;

public class InputValidation {
	public static void main(String[] args) {
		boolean inputCondition = false;
		String input = "a";
		Scanner reader = new Scanner(System.in);
		do {
			input = reader.nextLine();
			char inputChar = input.charAt(0);
			int inputNum = Character.getNumericValue(inputChar);
			if (Character.isDigit(inputChar)) {
				if (0 <= Character.getNumericValue(inputChar) && Character.getNumericValue(inputChar) <= 10) {
					inputCondition = true;
				} else {
					System.out.println("Wrong input.");
				}
			} else {
				System.out.println("Wrong input.");
			}
			
		} while (inputCondition  == false);
	}
}
