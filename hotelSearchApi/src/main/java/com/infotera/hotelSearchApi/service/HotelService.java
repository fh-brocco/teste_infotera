package com.infotera.hotelSearchApi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.infotera.hotelSearchApi.controller.HotelSearchController;
import com.infotera.hotelSearchApi.model.Address;
import com.infotera.hotelSearchApi.model.Hotel;


@Service
public class HotelService {

	@Value("${url.infotera}")
	String url;
	String uri = "/api/v1//avail/hotel?destination={destination}&start={start}&end={end}&occupancy={occupancy}";

	public Address search(String address) {
		String fullUrl = url + address;
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate.getForObject(fullUrl, Address.class);
	}

	private HotelSearchController hotelSearchController;
	
	 public List<Hotel> getHotels(Integer destination, String name, String end, String occupancy) {
	        return hotelSearchController.getHotels(name);
	    }
}
