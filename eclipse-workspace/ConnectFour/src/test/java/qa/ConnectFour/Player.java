package qa.ConnectFour;

import java.util.Random;

public class Player {	
	public Player(String id) {
		super();
		this.id = id;
	}
	
	private String id;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public int pickColumn() {
		
		return new Random().nextInt(7);
	}

}
