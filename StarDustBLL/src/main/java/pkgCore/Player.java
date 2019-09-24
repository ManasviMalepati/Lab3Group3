package pkgCore;

import java.util.UUID;
import java.util.Scanner;

public class Player {

	private UUID PlayerID;
	private String PlayerName;
	 
	public Player(UUID playerID, String playerName) {
		super();
		PlayerID = playerID;
		PlayerName = playerName;
	}
		
	public Player(String playerName) {
		this.PlayerID = UUID.randomUUID();
		PlayerName = playerName;
	}

	public String getPlayerName() {
		Scanner getName = new Scanner(System.in);
		System.out.println("Enter name: ");
		String playerName = getName.nextLine();
		return playerName;
	}

	public void setPlayerName(String playerName) {
		//FIXME: Set the player name
	}

	public UUID getPlayerID() {
		return PlayerID;
	}
	
	
	
	
}