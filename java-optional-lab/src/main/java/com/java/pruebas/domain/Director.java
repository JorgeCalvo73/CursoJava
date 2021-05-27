package com.java.pruebas.domain;

import java.util.Optional;

public class Director {

	private String name;
	private Optional<Address> address;

	public Director() {
		address = Optional.empty();
	}

	public Director(String nombre) {
		this.name = nombre;

		address = Optional.of(new Address("Madrid", "Calle"));
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Optional<Address> getAddress() {
		return address;
	}

	/*
	 * public void setAddress(Optional<Address> address) { this.address = address; }
	 */

}
