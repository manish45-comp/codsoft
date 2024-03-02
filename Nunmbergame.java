import java.util.Random;
import java.util.Scanner;

class Nunmbergame {
	private static final int MAX_CHANCES = 3;
	private static final int MAX_NUMBER = 100;
	public static void main(String[] args)
	{
		playGame();
	}
private static void playGame(){
	Scanner scanner = new Scanner(System.in);
	Random random = new Random();
	int score = 0;

	do {
		int randomNumber = random.nextInt(MAX_NUMBER) + 1;
		int chances = MAX_CHANCES;
		while (chances > 0){
			int userGuess = getUserInput(scanner);
			if (userGuess == randomNumber){
				System.out.println("Congratulations! You guessed it right.");
				score++;
				break;
			} else if (userGuess>randomNumber) {
				System.out.println("Too high. Try again");
				chances--;
				System.out.println("You have "+chances+" chances left");
			}
			else {
				System.out.println("Too low. Try again");
				chances--;
				System.out.println("You have "+chances+" chances left");
			}
		}
		System.out.println("Your score is "+ score);
		System.out.println("Do you want to try again");
		String playAgain = scanner.next();
		if (!playAgain.equalsIgnoreCase("y")){
			break;
		}
	}while (true);
	System.out.println("Thanks for playing!");
	scanner.close();
}

private static int getUserInput(Scanner scanner){
		while (true){
			System.out.println("Enter your Guess");
			try {
				return Integer.parseInt(scanner.next());
			}catch (NumberFormatException e){
				System.out.println("invalid input");
			}
		}

}


}





