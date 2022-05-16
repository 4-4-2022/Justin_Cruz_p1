package com.revature.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.model.Movies;

@Repository("moviesRepository")
public interface MoviesRepository extends JpaRepository<Movies, String>{

	public List<Movies> findAll();
//	public void buy(Movies movie);
//	public void rent(Movies movie);
//	public void returnMovie(int id);
}
