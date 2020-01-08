import java.util.ArrayList;
import java.util.Scanner;

public class HauntedMountains extends Level {
	
	private DarkWizard dark_wizard;
	
	
	private int dark_wizard_health = 100;
	private int player_health = 100;
	private int choice;
	private int item_choice;
	private String h_stone = "Health";
    	private String c_stone = "Crazy";
    	private Scanner scan = new Scanner (System.in);
	

	
	public HauntedMountains(Player player, SwordOfFire sword, StaffOfLight staff, WandOfWisdom wand, HealthStone health_stone, CrazyStone crazy_stone, Menus menu, DarkWizard dark_wizard) {
		super(player, sword, staff, wand, health_stone, crazy_stone, menu);
		this.dark_wizard = dark_wizard;
	}

	public void generateDescrption() {
		System.out.println("You are in the Haunted Mountains...There is a DARK WIZARD  hiding behind the rocks!");
		
	}
	
	//Method for player to play through Haunted Mountains level
	public void play_level(ArrayList<String> inventory) {
		//Set health of dark wizard
		dark_wizard.setHealth(dark_wizard_health);
		
		 while(player.getHealth() > 0 && dark_wizard.getHealth() > 0) {
			 
			 	System.out.println("The Dark Wizard is now attacking");
			 	menu.delay(2000);
	        	menu.clearScreen();
	        	
	        	//Dark Wizard Attack
	        	player_health = player.getHealth() - dark_wizard.attack();
	        	player.setHealth(player_health);
	        	
	        	player.checkHealth();
	        	System.out.println("Dark Wizard Health: " + dark_wizard.getHealth());
	        	menu.fightMenu(player);
	        	choice= scan.nextInt();
	        	
	        	if(choice >= 1 && choice <= 3) {
	        		
		        	switch(choice) {
		        	case 1:
		        		//Player attack
		        		dark_wizard_health = dark_wizard.getHealth() - player.attack(sword, staff, wand);
		        		dark_wizard.setHealth(dark_wizard_health);
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
		        			//Checks if inventory had crazy stone and uses it
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
