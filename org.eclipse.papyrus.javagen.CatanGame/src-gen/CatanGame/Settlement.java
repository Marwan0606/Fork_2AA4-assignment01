package CatanGame;

/**
 * Class that represents the Settlement building type in the game
 */
public class Settlement extends Building {
	public Settlement(Player owner, Node location) {
		super(owner, location);
	}
	/**
	 * Returns number of victory points for the Settlement type
	 * @return # of victory points
	 */
	public int getVictoryPoints() {
		return 1;
	}
}
