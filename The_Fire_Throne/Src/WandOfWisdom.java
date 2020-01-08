
import java.util.concurrent.ThreadLocalRandom;

public class WandOfWisdom extends Weapon {
	private int attackRange;

	
	public int getAttackRange() {
		return attackRange;
	
	}
	//Method that generates random attack number between 20 and 45
	public void setAttackRange() {
		
		attackRange = ThreadLocalRandom.current().nextInt(20, 45 + 1);
	}
	

		

}
