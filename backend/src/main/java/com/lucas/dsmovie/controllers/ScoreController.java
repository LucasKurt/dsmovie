package com.lucas.dsmovie.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lucas.dsmovie.dto.MovieDTO;
import com.lucas.dsmovie.dto.ScoreDTO;
import com.lucas.dsmovie.sevices.ScoreService;

@RestController
@RequestMapping(value = "/scores")
public class ScoreController {
	
	@Autowired
	private ScoreService service;
	
	@PutMapping
	public MovieDTO saveScore(@RequestBody ScoreDTO dto) {
		MovieDTO movieDto =service.saveScore(dto);
		return movieDto;
	}
	
	
}
