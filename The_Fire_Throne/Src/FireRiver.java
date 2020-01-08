import java.util.ArrayList;
import java.util.Scanner;

public class FireRiver extends Level {
	
	private Dragon dragon;
	
	
	private int dragon_health = 100;
	private int player_health = 100;
	private int choice;
	private int item_choice;
	private String h_stone = "Health";
    private String c_stone = "Crazy";
    private Scanner scan = new Scanner (System.in);
   
	
	public FireRiver(Player player, SwordOfFire sword, StaffOfLight staff, WandOfWisdom wand, HealthStone health_stone, CrazyStone crazy_stone, Menus menu, Dragon dragon) {
		super(player, sword, staff, wand, health_stone, crazy_stone, menu);
		this.dragon = dragon;
		
		
	}
	
	//Generate Description of Level
	public void generateDescrption() {
		System.out.println("You are at Fire River...There is a DRAGON drinkng from the river!");
	}
	
	//Method for user to play through level
	public void play_level(ArrayList<String> inventory) {
		//Set health for dragon
		dragon.setHealth(dragon_health);
		while(dragon.getHealth() > 0 && player.getHealth() > 0) {
			System.out.println("The Dragon is now attacking");
			menu.delay(2000);
        	menu.clearScreen();
        	
        	//Dragon Attack
        	player_health = player.getHealth() - dragon.attack();
        	player.setHealth(player_health);
        	
        	//Second check for player's health
        	player.checkHealth();
        	System.out.println("Dragon Health: " + dragon.getHealth());
        	//Menu for user
        	menu.fightMenu(player);
        	choice = scan.nextInt();
        	
        	
        	if(choice >= 1 && choice <= 3) {
        		//Choices for user
	        	switch(choice) {
	        	case 1:
	        		//Player Attack
	        		dragon_health = dragon.getHealth() - player.attack(sword, staff, wand);
	        		dragon.setHealth(dragon_health);
	        		break;
	        		
	        	case 2:
	        		if(player.checkInventory(inventory) > 0) {
	        			
	        			menu.itemMenu();
	        			item_choice = scan.nextInt();
	        			//Checks if inventory has health stone
	        			if(item_choice == 1 && inventory.contains(h_stone)) {
	        				player.useItem(inventory, h_stone);
	        				health_stone.healthBoost(player);
	        			}
	        			//Checks if inventory has crazy stone
	        			else if(item_choice == 2 && inventory.contains(c_stone)) {
	        				player.useItem(inventory, c_stone);
	        				crazy_stone.healthBoost(player);
	        			}
	        			
	        			else 
	        				System.out.println("Item not found");
	        			
	        		}
	        		
	        		else
	        			System.out.println("No items in your inventory!");
	        		break;
	        		
	        	case 3:
	        		System.exit(0);
	        		break;
	        		
	        	default:
	        		System.out.print("Invalid Number");
	        		break;
	        	
	        	}
	        	
	        	menu.delay(2000);
	        	menu.clearScreen();
	        	
        	
        	}
        	
        
        	
        }
		
	}
	
	

}
