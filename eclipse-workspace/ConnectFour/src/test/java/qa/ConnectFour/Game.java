package qa.ConnectFour;

import java.util.List;
import java.util.ArrayList;

public class Game {

	private String[][] board = new String[6][7];
	
	private List<Player> players = new ArrayList<>();
	public List<Player> getPlayers() {
		return players;
	}
	public boolean addPlayer(Player player) {
		return players.add(player);
	}
	
	public String[][] getBoard() {
		return board;
	}
	public void addCounterToColumn(Player player, int col) {
		
		int nullCheck = 0;	
		int i = board.length-1;
		while (nullCheck==0) {
			if (i >= 0) {
				if (board[i][col] == null) {
					board[i][col] = player.getId();
					nullCheck = 1;
				}				
				i--;
			} else {
				col = player.pickColumn();
				i = board.length-1;
			}
		}		
	}
	public void showBoard() {
		for (String[] i : board) {
			String row = "";
			for (String j : i) {
				if (j== null) {
					row += "|X|";
				} else {
					row += j;
				}				
			}
			System.out.println(row);
		}		
	}
}
