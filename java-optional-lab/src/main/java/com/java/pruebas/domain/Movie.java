package com.java.pruebas.domain;

import java.util.Optional;

public class Movie {
	private Integer id;
	private String title;
	private Optional<Director> director;

	public Movie() {
		director = Optional.empty();
	}

	public Movie(Integer id, String title) {
		this.id = id;
		this.title = title;

		Director d = new Director("Nolan");
		this.director = Optional.of(d);

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Optional<Director> getDirector() {
		return director;
	}

	/*
	 * public void setDirector(Optional<Director> director) { this.director =
	 * director; }
	 */
}
