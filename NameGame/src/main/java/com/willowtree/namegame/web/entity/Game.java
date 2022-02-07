package com.willowtree.namegame.web.entity;


import java.util.List;
import java.util.Random;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Game {

	
	//fields
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private UUID id;
	
	@Column(nullable = false)
	private int score;
	
	@Column(nullable = false)
	private boolean isPracticeMode; //boolean for binary reasons.  We only have 2 game modes.
	
	private List<Profile> gameProfiles;
	

	public Game(boolean mode)
	{
		this.isPracticeMode = mode;
		this.score = 0;
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
