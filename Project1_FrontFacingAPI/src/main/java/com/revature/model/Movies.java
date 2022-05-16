package com.revature.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

//Inventory for all available movies
@Entity
@Table(name = "movies")
public class Movies {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "movies_id_seq")
	@SequenceGenerator(allocationSize = 1, name = "movies_id_seq")
	private long id;
	@Column(name = "name", nullable = false, unique = true)
	private String name;
	@Column(name = "genre")
	private String genre;
	@Column(name = "description")
	private String description;
	@Column(name = "stock")
	private int stock;
	public Movies(long id, String name, String genre, String description, int stock) {
		super();
		this.id = id;
		this.name = name;
		this.genre = genre;
		this.description = description;
		this.stock = stock;
	}
	public Movies() {
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
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	@Override
	public int hashCode() {
		return Objects.hash(description, genre, id, name, stock);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Movies other = (Movies) obj;
		return Objects.equals(description, other.description) && Objects.equals(genre, other.genre) && id == other.id
				&& Objects.equals(name, other.name) && stock == other.stock;
	}
	@Override
	public String toString() {
		return "Movies [id=" + id + ", name=" + name + ", genre=" + genre + ", description=" + description + ", stock="
				+ stock + "]";
	}

	
	
}
