import java.util.Scanner;
import java.util.Random;

public class NumberGuessing {
	public static void main(String[] args) {
		Random r = new Random();
		int secretNumber = r.nextInt(10);
		Scanner reader = new Scanner(System.in);
		int guess = -1;
		int guessCounter = 0;
		while (guess != secretNumber) {
			if (guessCounter == 0) {
				System.out.print("Type your guess: \n $ ");
				guess = reader.nextInt();
				guessCounter = 1;
			} else {
				if (guess < secretNumber) {
					System.out.print("Too low! \n $ ");
				} else {
					System.out.print("Too high! \n $ ");
				}
				guess = reader.nextInt();
			}
		}
	}
}
