import java.util.Scanner;

public class MenuPrompt {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int exitStatus = 0;
		do {
			System.out.println("1. Say Hello \n2. Say Goodbye \n3. Exit");
			exitStatus = reader.nextInt();
		} while (exitStatus != 3);
	}
}
