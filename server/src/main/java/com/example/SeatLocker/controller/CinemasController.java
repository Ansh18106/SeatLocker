package com.example.SeatLocker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "cinema/")
public class CinemasController {
	
	@GetMapping(path = "/allMovies")
	public void getAllMovies() {
		
	}
	
	@GetMapping(path = "/movie/{movieName}")
	public void register(@PathVariable("movieName") String movieName) {
		
	}
	
	
}
