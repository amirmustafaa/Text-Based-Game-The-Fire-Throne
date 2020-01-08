import javax.swing.JDialog;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		SplashScreen splash = new SplashScreen(2000);
        splash.generateSplashScreen();

        try {
			StartScreen dialog = new StartScreen();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setLocationRelativeTo(null);
			dialog.setVisible(true);			
		} catch (Exception e) {
			e.printStackTrace();
		}
       
        
        // Scanner for User Input
        Scanner scan = new Scanner (System.in);
        
        //Create Menu Item
        Menus menu = new Menus();
        menu.delay(2000);
        menu.clearScreen();
        

        System.out.println("Enter your Name");
        String name = scan.next();
        
        menu.clearScreen();
        
        System.out.println("Enter your class(warrior, guardian, wizard)");
        String user_class = scan.next();
        
        menu.clearScreen();
        
        //Create Player and Monsters
        Player player = new Player(name, user_class, 100);
        Dragon dragon = new Dragon();
        DarkWizard dark_wizard = new DarkWizard();
        ProtectorOfKing protector = new ProtectorOfKing();
        KingOfFire king = new KingOfFire();
        
        //Create Weapons 
        SwordOfFire sword = new SwordOfFire();
        StaffOfLight staff = new StaffOfLight();
        WandOfWisdom wand = new WandOfWisdom();
        
        //Create Items
        ArrayList<String> inventory = new ArrayList<String>();
        HealthStone health_stone = new HealthStone();
        CrazyStone crazy_stone = new CrazyStone();
        String h_stone = "Health";
        String c_stone = "Crazy";

  
        // Create Locations 
        FireRiver river = new FireRiver(player, sword, staff, wand, health_stone, crazy_stone, menu, dragon );
        HauntedMountains mountain = new HauntedMountains(player, sword, staff, wand, health_stone, crazy_stone, menu, dark_wizard);
        TheCastleDoor entrance = new TheCastleDoor(player, sword, staff, wand, health_stone, crazy_stone, menu, protector);
        TheThroneRoom throne_room = new TheThroneRoom(player, sword, staff, wand, health_stone, crazy_stone, menu, king);
        
        //Generate Riddles
        Riddles riddle = new Riddles();
        String riddle_answer = " " ;
        
        //Images
        //Images image = new Images();
      
        //Add health and crazy stone to inventory
        player.storeItem(inventory, h_stone);
        player.storeItem(inventory, c_stone);
        
        //Generate Description of Game
        menu.description(player);
        menu.delay(12000);
        menu.clearScreen();
        
        
        //Fire River Level
        riddle.firstRiddle(riddle_answer);
        menu.delay(3000);
        //image.generateRiver();
        river.generateDescrption();
        river.play_level(inventory);
        menu.delay(2000);
        menu.clearScreen();
        player.checkHealth();
        System.out.println("The Dragon has been defeated! You may continue with your journey.");
        
        menu.delay(2000);
    	menu.clearScreen();
        
        //Haunted Mountains Level
        riddle.secondRiddle(riddle_answer);
        menu.delay(3000);
        //image.generateMountain();
        mountain.generateDescrption();
        menu.delay(2000);
        menu.clearScreen();
        mountain.play_level(inventory);	
        
        player.checkHealth();
       
        System.out.println("The Dark Wizard has been defeated! You may continue with your journey.");
        
        player.storeItem(inventory, h_stone);
        	
       
        //Castle Entrance Level
        riddle.thirdRiddle(riddle_answer);
        menu.delay(3000);
        //image.generateEntrance();
        entrance.generateDescrption();   
        menu.delay(2000);
        menu.clearScreen();
        entrance.play_level(inventory);
        
        player.checkHealth();

        System.out.println("The King's Protector has been defeated! You must now face the king!.");
        
        
        	
        
        //Throne Level 
        riddle.fourthRiddle(riddle_answer);
        menu.delay(3000);
        //image.generateThrone();
        throne_room.generateDescrption();
        menu.delay(2000);
        menu.clearScreen();
        throne_room.play_level(inventory);

        scan.close();

        player.checkHealth();
               
        System.out.println("You are now the new king! May your reign last forever!");
        
        
       
	}

}
