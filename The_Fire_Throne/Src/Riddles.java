import java.util.Scanner;

public class Riddles {
	private int chances;
	
	Scanner scan = new Scanner(System.in);
	
	//Method where user inputs string to match correct answer with only 10 chances
	public void firstRiddle(String answer) {
		chances = 0;
		System.out.println("You must complete this riddle to find your way to fire river...");
		while(chances <= 10) {
			System.out.println("What starts with e, ends with e, and contains one letter?");
			answer = scan.next();
			if(answer.equals("envelope")) {
				System.out.println("You may continue to the fire river!");
				break;
			}
			else {
				System.out.println("Wrong Answer! Try Again!");
			}
			chances += 1;
		}
		
		if (chances > 10) {
			System.out.println("You have ran out of chances! You will be lost FOREVER! GAME OVER!!!!!!!");
			System.exit(0);
		}
		
	}
	
	//Method where user inputs string to match correct answer with only 10 chances
	public void secondRiddle(String answer) {
		chances = 0;
		System.out.println("You must complete this riddle to find your way to the haunted mountains...");
		while(chances <= 10) {
			System.out.println("What kind of coat is always wet when you put it on?");
			answer = scan.next();
			if(answer.equals("paint")) {
				System.out.println("You may continue to the haunted mountains!");
				break;
			}
			else {
				System.out.println("Wrong Answer! Try Again!");
			}
			chances += 1;
		}
		if (chances > 10) {
			System.out.println("You have ran out of chances! You will be lost FOREVER! GAME OVER!!!!!!!");
			System.exit(0);
		}
		
	}
		
	
	//Method where user inputs string to match correct answer with only 10 chances
	public void thirdRiddle(String answer) {
		chances = 0;
		System.out.println("You must complete this riddle to find your way to the castle entrance...");
		while(chances <= 10) {
			System.out.println("What has 13 hearts, but no other organs");
			answer = scan.next();
			if(answer.equals("cards") || answer.equals("deck of cards")) {
				System.out.println("You may continue to the castle entrance!");
				break;
			}
			else {
				System.out.println("Wrong Answer! Try Again!");
			}
			chances += 1;
		}
		if (chances > 10) {
			System.out.println("You have ran out of chances! You will be lost FOREVER! GAME OVER!!!!!!!");
			System.exit(0);
		}
		
	}
	//Method where user inputs string to match correct answer with only 10 chances
	public void fourthRiddle(String answer){
		chances = 0;
		System.out.println("You must complete this riddle to find your way to the throne room...");
		while(chances <= 10) {
			System.out.println("Until I am measured I am not known.Yet how you miss me when I have flown.");
			answer = scan.next();
			if(answer.equals("time")) {
				System.out.println("You may continue to the throne room!");
				break;
			}
			else {
				System.out.println("Wrong Answer! Try Again!");
			}
			chances += 1;
		}
		if (chances > 10) {
			System.out.println("You have ran out of chances! You will be lost FOREVER! GAME OVER!!!!!!!");
			System.exit(0);
		}
		
	}
	
	
	
	

}
