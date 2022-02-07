package com.willowtree.namegame.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.willowtree.namegame.web.entity.Game;
import com.willowtree.namegame.web.entity.Profile;

class NameGameFunctionalUnitTests {

	private Game game;
	@Test
	void zeroScoreOnNewGame() {
		game = new Game(true);  //creates new game in practice Mode;
		assertEquals(game.getScore(), 0);
	}
	
	@Test
	void newGameModeSetByConstructorTest()
	{
		game = new Game(false);
		assertFalse(game.isPracticeMode());
	}
	
	/**
	 * Test that each game gets 6 random profiles from the profiles API.
	 */
	@Test
	void gameShouldGenerate6RandomProfiles()
	{
		game = new Game(true);
		List<Profile> gameProfiles = new ArrayList<Profile>();
		gameProfiles.addAll(game.getGameProfiles());
		assertEquals(6,gameProfiles.size());
	}

}
