package com.infotera.hotelSearchApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infotera.hotelSearchApi.model.Hotel;
import com.infotera.hotelSearchApi.service.HotelService;

@RestController
@RequestMapping("/hoteis")
public class HotelSearchController {

	@Autowired
	private HotelService service;

	@GetMapping(value = "/search/{destination}/{start}/{end}/{occupancy}")
	private ResponseEntity<List<Hotel>> listHotels(@PathVariable Integer destination, @PathVariable String start,
			@PathVariable String end, @PathVariable String occupancy) {
		List<Hotel> hoteis = service.getHotels(destination, start, end, occupancy);
		return ResponseEntity.ok(getHotels(null));
	}

	@GetMapping("/search/{destination}")
	public ResponseEntity<String> GetByAddress(@PathVariable String address) {
		return ResponseEntity.ok(address);
	}

	@GetMapping(value = "/{name}")
	public List<Hotel> getHotels(@PathVariable("name") String name) {
		return null;
	}

}
