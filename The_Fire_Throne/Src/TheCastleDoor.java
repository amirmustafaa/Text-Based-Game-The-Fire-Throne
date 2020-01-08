import java.util.ArrayList;
import java.util.Scanner;

public class TheCastleDoor extends Level {

	private ProtectorOfKing protector;
	
	private int protector_health = 100;
	private int player_health = 100;
	private int choice;
	private int item_choice;
	private String h_stone = "Health";
    private String c_stone = "Crazy";
    private Scanner scan = new Scanner (System.in);
	
	
	public TheCastleDoor(Player player, SwordOfFire sword, StaffOfLight staff, WandOfWisdom wand,
			HealthStone health_stone, CrazyStone crazy_stone, Menus menu,ProtectorOfKing protector ) {
		super(player, sword, staff, wand, health_stone, crazy_stone, menu);
		
		this.protector = protector;
	}
	

	public void generateDescrption() {
		System.out.println("You are at the entrace of The Castle...THE KING'S PROTECTOR will fight you to the death!!");
		
	}
	
	//Method that allows user to play through Castle door level
	public void play_level(ArrayList<String> inventory) {
		
		protector.setHealth(protector_health);
		
		while(player.getHealth() > 0 && protector.getHealth() > 0) {
			
			System.out.println("The Protector is now attacking");
			menu.delay(2000);
        	menu.clearScreen();
	    	
        	//Protector Attack
        	player_health = player.getHealth() - protector.attack();
        	player.setHealth(player_health);
        	
        	//Second player health check to immediately end game if player health is 0
        	player.checkHealth();
        	//Fight Menu
        	System.out.println("Protector Health: " + protector.getHealth());
        	menu.fightMenu(player);
        	choice= scan.nextInt();
        	
        	if(choice >= 1 && choice <= 3) {
	        	switch(choice) {
	        	case 1:
	        		//Player attack
	        		protector_health = protector.getHealth() - player.attack(sword, staff, wand);
	        		protector.setHealth(protector_health);
	        		break;
	        	case 2:
	        		if(player.checkInventory(inventory) > 0) {
	        			menu.itemMenu();
	        			item_choice = scan.nextInt();
	        			
	        			//Checks if inventory contains health stone and uses it
	        			if(item_choice == 1 && inventory.contains(h_stone)) {
	        				player.useItem(inventory, h_stone);
	        				health_stone.healthBoost(player);
	        			}
	        			//checks if inventory contains crazy stone and uses it
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
