import java.util.Scanner;
public class CrazyStone extends Item {
	
	//Method to boost Player's health if number is guessed correctly
	public void healthBoost(Player player) {
		//Number that Player has to guess
		int right_number = 7;
		System.out.println("Are you crazy? Yes, this item will make you invinsible, but it will most likely kill you in the process!");
		Scanner scan_choice = new Scanner(System.in);
		System.out.println("Choose a number between 1 and 10. If you don't guess right, you die!!!!");
		int crazy_choice = scan_choice.nextInt();
		
		//Set Health if user input matches right number
		if (crazy_choice == right_number) {
			player.setHealth(1000);
		}
		else {
			System.out.println("You guessed wrong! Time to die!");
			System.exit(0);
		}
	
	}


}
