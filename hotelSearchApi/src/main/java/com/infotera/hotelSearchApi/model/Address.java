package com.infotera.hotelSearchApi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Address {
		
	@JsonProperty("zipcode")
	public String getZipcode() {
		return this.zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	String zipcode;

	@JsonProperty("address")
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	String address;

	@JsonProperty("number")
	public String getNumber() {
		return this.number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	String number;

	@JsonProperty("complement")
	public String getComplement() {
		return this.complement;
	}

	public void setComplement(String complement) {
		this.complement = complement;
	}

	String complement;

	@JsonProperty("city")
	public City getCity() {
		return this.city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	City city;

	@JsonProperty("neighborhood")
	public String getNeighborhood() {
		return this.neighborhood;
	}

	public void setNeighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
	}

	String neighborhood;

	@JsonProperty("coordinates")
	public Coordinates getCoordinates() {
		return this.coordinates;
	}

	public void setCoordinates(Coordinates coordinates) {
		this.coordinates = coordinates;
	}

	Coordinates coordinates;
	
	

}
