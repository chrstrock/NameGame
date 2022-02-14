package com.willowtree.namegame.web.entity;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;


public class Game {

	
	//fields

	private UUID id;
	
	
	private int score;
	
	
	private boolean isPracticeMode; //boolean for binary reasons.  We only have 2 game modes.
	
	private List<Profile> gameProfiles = new ArrayList<Profile>(6);
	

	public Game(boolean mode)
	{
		this.isPracticeMode = mode;
		this.score = 0;
		
		Random rand = new Random();
		
	}
	
	
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	public boolean isPracticeMode() {
		return isPracticeMode;
	}
	public void setPracticeMode(boolean isPracticeMode) {
		this.isPracticeMode = isPracticeMode;
	}
	public List<Profile> getGameProfiles() {
		return gameProfiles;
	}
	public void setGameProfiles(List<Profile> gameProfiles) {
		this.gameProfiles = gameProfiles;
	}
	
	@Override
	public String toString() {
		return "Game [id=" + id + ", score=" + score + ", isPracticeMode=" + isPracticeMode + ", gameProfiles="
				+ gameProfiles + "]";
	}
	
	
	/**
	 * 
	 * @return
	 */
	public void calculateScore()
	{
		
	}
	
	
	

}
