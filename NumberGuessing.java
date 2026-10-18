import java.util.Scanner;
import java.util.Random;

public class NumberGuessing {
	public static void main(String[] args) {
		Random r = new Random();
		int secretNumber = r.nextInt(10);
		Scanner reader = new Scanner(System.in);
		int guess = -1;
		while (guess != secretNumber) {
			System.out.println("Type your guess \n");
			guess = reader.nextInt();
		}

	}
}
