import java.util.concurrent.ThreadLocalRandom;

public class DarkWizard implements Monster {
	private int health;
	private int attackRange;
	
	public void setHealth(int h) {
		health = h;
	
	}
	
	public int getHealth() {
		return health;
	}
	
	//Method to generate random attack number
	public int attack() {
		attackRange = ThreadLocalRandom.current().nextInt(5, 20 + 1);
		return attackRange;
		
	}
	
	
}
		

	


