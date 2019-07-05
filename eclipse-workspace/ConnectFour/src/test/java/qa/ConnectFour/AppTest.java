package qa.ConnectFour;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class AppTest {
	
	private Player r = new Player("|R|");
	private Player b = new Player("|B|");
	private Game game = new Game();
		
	@Test
	public void playerPickCol() {
		int playerChoice = r.pickColumn();
		assertTrue("Pick a valid column", 0 <= playerChoice && playerChoice <= 6 );
	}
	
	@Test	
	public void addCounterToColumn2() {		
		String[][] expected = new String[6][7];
		expected[5][1] = "|R|";
		
		game.addCounterToColumn(r, 1);
		String[][] actual = game.getBoard();
		
//		game.showBoard();
		
		assertThat(actual, is(expected));		
	}
	
	@Test
	public void addPlayersToGame() {
		game.addPlayer(r);
		game.addPlayer(b);
		
		assertEquals(2, game.getPlayers().size());		
	}
	
	@Test
	public void addMultipleCounters() {
		String[][] expected = new String[6][7];
		expected[5][6] = "|R|";
		expected[4][6] = "|R|";
		expected[3][6] = "|R|";
		expected[5][2] = "|R|";
		
		
		for (int i = 0; i < 3; i++) {
		game.addCounterToColumn(r, 6);
		}
		game.addCounterToColumn(r, 2);
		String[][] actual = game.getBoard();
		
//		game.showBoard();
		
		assertThat(actual, is(expected));		
	}
	
	@Test
	public void preventAddToFullColumn() {
		game.addCounterToColumn(b, 2);
		for (int i = 0; i < 7; i++) {
			if (i%2 == 0) {
				game.addCounterToColumn(r, 6);
			} else {
				game.addCounterToColumn(b, 6);
			}
		}
		String[][] actual = game.getBoard();
		
		game.showBoard();		
	}
}
   
