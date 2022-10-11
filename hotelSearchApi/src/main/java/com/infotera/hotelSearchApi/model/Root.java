package com.infotera.hotelSearchApi.model;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Root {

	@JsonProperty("hotel")
	public Hotel getHotel() {
		return this.hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	Hotel hotel;

	@JsonProperty("hotels")
	public ArrayList<Hotel> getHotels() {
		return this.hotels;
	}

	public void setHotels(ArrayList<Hotel> hotels) {
		this.hotels = hotels;
	}

	ArrayList<Hotel> hotels;

}
