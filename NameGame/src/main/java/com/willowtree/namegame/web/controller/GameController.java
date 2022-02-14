package com.willowtree.namegame.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.willowtree.namegame.web.entity.Game;
import com.willowtree.namegame.web.entity.Profile;
import com.willowtree.namegame.web.repo.GameRepository;

@RestController
@RequestMapping("/")
public class GameController {

	@Autowired
	private GameRepository gameRepo;
	
	/**
	 * returns a new game given the chosen mode.  Mapped to root
	 * @return
	 */
	@PostMapping
	
	public Game newGame(@PathVariable boolean mode)
	{
		return new Game(mode); 
	}
	
	@PutMapping(value = "/")
	@ResponseStatus(HttpStatus.OK)
	public void updateGame(@RequestBody Game game)
	{
		//update score based on choice of image
		
	}
	
	
}
