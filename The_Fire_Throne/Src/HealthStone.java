
public class HealthStone extends Item {
	//Method increases Player's health by 100
	public void healthBoost(Player player) {
		int x = 100;
		x += player.getHealth();
		player.setHealth(x);

	}

}
