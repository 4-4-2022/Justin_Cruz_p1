package com.revature.service;

import java.util.List; 

import org.springframework.stereotype.Service;

import com.revature.model.Movies;
import com.revature.repository.MoviesRepository;

@Service("movieAPIService")
public class MovieAPIService {

	private MoviesRepository moviesRepository;
	
	public List<Movies> findAll(){
		return this.moviesRepository.findAll();
	}
//	public void buy(Movies movie);
//	public void rent(Movies movie);
//	public void returnMovie(int id);
}
