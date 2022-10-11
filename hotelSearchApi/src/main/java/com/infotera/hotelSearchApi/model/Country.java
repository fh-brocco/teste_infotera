package com.infotera.hotelSearchApi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Country {

	@JsonProperty("code")
	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	String code;

	@JsonProperty("name")
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	String name;
}