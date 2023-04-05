import java.util.Scanner;

public class GFG {

	public static void
	guessingNumberGame(){
		Scanner sc = new Scanner(System.in);
		int range = 0;
		System.out.println("Enter the Max range for the guessing number: ");
		range = sc.nextInt();
		int number = 1 + (int)(range* Math.random());
		int K = 5;
        System.out.println("Enter the number of trials: ");
        K = sc.nextInt();
		int i, guess;
		System.out.println("A number is chosen between 1 to " + range + ". Guess the number within " + K + " trials."); 
		for (i = 0; i < K; i++) {
			System.out.println("Trial Number: " + (i+1));
			System.out.println("Number of trials left: " + (K - i)); 
			System.out.println("Guess the number:");
			guess = sc.nextInt();
			if (number == guess) {
				System.out.println("Congratulations! You guessed the number.");
				break; 
			}
			else if (number > guess && i != K - 1) {
				System.out.println("The number is greater than " + guess);
			}
			else if (number < guess && i != K - 1) {
				System.out.println("The number is less than " + guess);
			}
		} 
		if (i == K) {
			System.out.println("You have exhausted " +  K + " trials."); 
			System.out.println("The number was " + number);
		} 
	}
	public static void main(String arg[]){
		guessingNumberGame();
	}
}
//Guessing Game in Java
not in the mood