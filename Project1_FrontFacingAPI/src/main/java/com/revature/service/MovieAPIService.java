package com.revature.service;

import java.util.List;

import javax.jws.WebService;

import com.revature.model.Movies;

@WebService
public interface MovieAPIService {

	public List<Movies> findAll();
	public void buy(Movies movie);
	public void rent(Movies movie);
	public void returnMovie(int id);
}
