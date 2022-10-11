package com.infotera.hotelSearchApi.model;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Hotel {

	@JsonProperty("id")
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	Long id;

	@JsonProperty("keyDetail")
	public String getKeyDetail() {
		return this.keyDetail;
	}

	public void setKeyDetail(String keyDetail) {
		this.keyDetail = keyDetail;
	}

	String keyDetail;

	@JsonProperty("name")
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	String name;

	@JsonProperty("checkIn")
	public String getCheckIn() {
		return this.checkIn;
	}

	public void setCheckIn(String checkIn) {
		this.checkIn = checkIn;
	}

	String checkIn;

	@JsonProperty("checkOut")
	public String getCheckOut() {
		return this.checkOut;
	}

	public void setCheckOut(String checkOut) {
		this.checkOut = checkOut;
	}

	String checkOut;

	@JsonProperty("description")
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	String description;

	@JsonProperty("address")
	public Address getAddress() {
		return this.address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	Address address;

	@JsonProperty("images")
	public ArrayList<Image> getImages() {
		return this.images;
	}

	public void setImages(ArrayList<Image> images) {
		this.images = images;
	}

	ArrayList<Image> images;
}
