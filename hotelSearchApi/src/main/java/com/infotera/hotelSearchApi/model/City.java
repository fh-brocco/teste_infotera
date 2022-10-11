package com.infotera.hotelSearchApi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class City {

	 @JsonProperty("name") 
	    public String getName() { 
			 return this.name; } 
	    public void setName(String name) { 
			 this.name = name; } 
	    String name;
	    @JsonProperty("country") 
	    public Country getCountry() { 
			 return this.country; } 
	    public void setCountry(Country country) { 
			 this.country = country; } 
	    Country country;
	
}
