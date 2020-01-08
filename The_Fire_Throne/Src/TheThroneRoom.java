import java.util.ArrayList;
import java.util.Scanner;

public class TheThroneRoom extends Level {
	
	KingOfFire king;
	
	private int king_health = 100;
	private int player_health = 100;
	private int choice;
	private int item_choice;
	private String h_stone = "Health";
    private String c_stone = "Crazy";
    private Scanner scan = new Scanner (System.in);
	
	public TheThroneRoom(Player player, SwordOfFire sword, StaffOfLight staff, WandOfWisdom wand,
			HealthStone health_stone, CrazyStone crazy_stone, Menus menu, KingOfFire king) {
		super(player, sword, staff, wand, health_stone,crazy_stone, menu);
		this.king = king;
	}

	public void generateDescrption() {
		System.out.println("You are in the Throne Room...The FIRE KING awaits your challenge");
		
	}
	
	//Method that allows player to play through throne level
	public void play_level(ArrayList<String> inventory) {
		king.setHealth(king_health);
		while(player.getHealth() > 0 && king.getHealth() > 0) {
			System.out.println("The King is now attacking");
			menu.delay(2000);
        	menu.clearScreen();
	    	
        	//King Attack
        	player_health = player.getHealth() - king.attack();
        	player.setHealth(player_health);
        	//Second health check for player to immediately end game if player health is 0
        	player.checkHealth();
        	//Display fight menu
        	System.out.println("Blood King Health: " + king.getHealth());
        	menu.fightMenu(player);
        	choice= scan.nextInt();
        	
        	if(choice >= 1 && choice <= 3) {
        		
	        	switch(choice) {
	        	case 1:
	        		//Player attack
	        		king_health = king.getHealth() - player.attack(sword, staff, wand);
	        		king.setHealth(king_health);
	        		break;
	        	case 2:
	        		if(player.checkInventory(inventory) > 0) {
	        			menu.itemMenu();
	        			item_choice = scan.nextInt();
	        			//Checks inventory to see if it contains health stone and uses it
	        			if(item_choice == 1 && inventory.contains(h_stone)) {
	        				player.useItem(inventory, h_stone);
	        				health_stone.healthBoost(player);
	        			}
	        			//Checks inventory to see if it contains crazy stone and uses it
	        			else if(item_choice == 2 && inventory.contains(c_stone)) {
	        				player.useItem(inventory, c_stone);
	        				crazy_stone.healthBoost(player);
	        			}
	        			
	        			else 
	        				System.out.println("Item not found");
	        
	        		}
	        		
	        		else
	        			System.out.println("No Items in your Inventory!");

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
