import java.util.concurrent.ThreadLocalRandom;

public class KingOfFire implements Monster {
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
		
		attackRange = ThreadLocalRandom.current().nextInt(15, 50 + 1);
		return attackRange;

		
	}

}
