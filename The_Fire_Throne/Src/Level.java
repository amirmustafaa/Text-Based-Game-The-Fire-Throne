import java.util.ArrayList;

public abstract class Level {
	
	protected Player player;
	protected SwordOfFire sword;
	protected StaffOfLight staff;
	protected WandOfWisdom wand;
	protected HealthStone health_stone;
	protected CrazyStone crazy_stone;
	protected Menus menu;

	public Level(Player player, SwordOfFire sword, StaffOfLight staff, WandOfWisdom wand, HealthStone health_stone, CrazyStone crazy_stone, Menus menu) {
		this.player = player;
		this.sword = sword;
		this.staff = staff;
		this.wand = wand;
		this.health_stone = health_stone;
		this.crazy_stone = crazy_stone;
		this.menu = menu;		
	}
	//generate description of level
	public abstract void generateDescrption();
		

		
	//Method allows player to play through level
	public abstract void play_level(ArrayList<String> inventory) ;	
	

}
