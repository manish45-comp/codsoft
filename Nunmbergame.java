import java.util.Random;
import java.util.Scanner;

class Nunmbergame {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int randomNumber = random.nextInt(100);
		int score = 0;
		do {
				System.out.println("Guess the Number.");
				int chances = 3;
				while (chances > 0){
					int userGuess = scanner.nextInt();
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

}


}





