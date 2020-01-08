
public class Item {
	//Method boosts Player's health by 10
	public void healthBoost(Player player) {
		int x = 10;
		x += player.getHealth();
		player.setHealth(x);

	}

}
