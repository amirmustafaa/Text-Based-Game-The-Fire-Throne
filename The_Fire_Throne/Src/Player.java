
import java.util.ArrayList;

public class Player {
	private String name;
	private int health;
	private String player_class;
	

	
	public Player(String name, String player_class, int health) {
		this.name = name;
		this.player_class = player_class;
		this.health = health;
	}
	
	public void setName(String n) {
		name = n; 
	}
	
	public String getName() {
		return name;
	}
	
	public void setHealth(int h) {
		health = h;
	} 
	
	public int getHealth() {
		return health;
	}
	
	//Method to end game if players health is 0 or below
	public void checkHealth() {
		if(health <= 0) {
			System.out.println("You have been Killed!");
			System.out.println("GAME OVER");
	        System.exit(0);
	        }
	}
	
	public void setPlayerClass(String c) {
		player_class = c;		
	}
	
	public String getPlayerClass() {
		return player_class;
	}
	
	
	//Method for player to attack monster
	public int attack (SwordOfFire sword, StaffOfLight staff, WandOfWisdom wand) {
		if(player_class.equals("warrior")) {
			System.out.println("You are attacking with your sword!");
			sword.setAttackRange();
			return sword.getAttackRange();
		}
		else if (player_class.equals("guardian")) {
			System.out.println("You are now attacking with your staff!");
			staff.setAttackRange();
			return staff.getAttackRange();
		}
		else if (player_class.equals("wizard")) {
			System.out.println("You are now attacking with your wand!");
			wand.setAttackRange();
			return wand.getAttackRange();
		}
		else {
			System.out.println("You are attacking with your hands!");
			sword.setAttackRange();
			return sword.getAttackRange();
		}
			
		
	}
	
	
	//Method to remove item from inventory
	public void useItem(ArrayList<String> inventory, String item) {
		 inventory.remove(item);
	}
	
	//Method to add item to inventory
	public void storeItem(ArrayList<String> inventory, String item) {
		
		inventory.add(item);
	}
	
	//Method to check size of inventory
	public int checkInventory(ArrayList<String> inventory) {
		
		return inventory.size();
	}

		
		
}
	
	
	
	


