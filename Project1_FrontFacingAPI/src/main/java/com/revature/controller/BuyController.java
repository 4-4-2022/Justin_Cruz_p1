package com.revature.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.model.Movies;
import com.revature.service.MovieAPIService;

@RestController
@RequestMapping(value = "/movies")
public class BuyController {

	@Autowired
	private MovieAPIService movieAPIService;
	
	@GetMapping("/view") //View all movies (within this service)
	public List<Movies> getAllMovies() {
		return this.movieAPIService.findAll();
	}
	
//	@CrossOrigin(origins = "http://localhost:8081")
//	@GetMapping("/buy/{name}") //Buy a movie (within Buying Service)
//	
//	
//	@CrossOrigin(origins = "http://localhost:8082")
//	@GetMapping("/rent/{name}") //Rent a movie (within Renting Service)
//
//	
//	@CrossOrigin(origins = "http://localhost:8082")
//	@GetMapping("/return/{id}") //Return a movie (within Renting Service)
}
