package com.revature.service;

import java.util.List;

import javax.jws.WebService;

import com.revature.model.Movies;

@WebService
public interface MovieService {

	public List<Movies> findAll();
}
