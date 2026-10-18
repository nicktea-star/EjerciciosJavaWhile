import java.util.Scanner;

public class RunningTotal {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int sum = 0;
		int input = 0;
		do {
			System.out.printf("Current sum: %d\n", sum);
			input = reader.nextInt();
			sum += input;
		} while (input != 0);
	}
}
