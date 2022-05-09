package com.revature.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

//Inventory for all RENTED movies to keep track of which movies can be returned
@Entity
@Table(name = "rented_movies")
public class RentedMovies {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "rented_movie_id_seq")
	@SequenceGenerator(allocationSize = 1, name = "rented_movie_id_seq")
	private long id;
	@Column(name = "name", nullable = false)
	private String name;
	public RentedMovies(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public RentedMovies() {
		super();
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RentedMovies other = (RentedMovies) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
	@Override
	public String toString() {
		return "Movies [id=" + id + ", name=" + name + "]";
	}
	
	
	
}
