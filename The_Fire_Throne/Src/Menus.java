
public class Menus {
	
	public void description(Player player) {
		System.out.println("Hello " + player.getName() + "! You've come here to kill the king and take the throne for yourself.\n" +
		"First you have to travel through the FIRE RIVER and HAUNTED MOUNTAINS \n" + "and then you can face THE KING! If you defeat him,\n" +
		"You will sit on the FIRE THRONE and rule over your new KINGDOM!");
		
	}
	
	
	public void fightMenu(Player player) {
		System.out.println("Your Health: " + player.getHealth());
		System.out.println("1. Attack");
		System.out.println("2. Use Item");
		System.out.println("3. Quit Game");
	}
	
	public void itemMenu() {
		System.out.println("What Item do you want to use");
		System.out.println("1. Health Stone");
		System.out.println("2. Crazy Stone");
	}

	
	public void clearScreen() {
		
		for (int i = 0; i < 70; ++i) 
			System.out.println(" ");

	}
	
	//Add delay to application
	public void delay(int time) {
    	try
    	{
    		Thread.sleep(time);
    	}
    	catch(InterruptedException ex)
    	{
    		Thread.currentThread().interrupt();
    	}
	}
	
	
}

