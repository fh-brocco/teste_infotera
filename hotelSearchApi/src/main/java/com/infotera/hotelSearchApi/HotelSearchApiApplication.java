package com.infotera.hotelSearchApi;

import java.io.File;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.infotera.hotelSearchApi.model.Root;

@SpringBootApplication
public class HotelSearchApiApplication {
	
	
	public static void main(String[] args)throws JsonProcessingException  {
				SpringApplication.run(HotelSearchApiApplication.class, args);

		try {
			ObjectMapper om= new ObjectMapper();
			Root root = om.readValue(new File ("hotel-json.json"), Root.class);
			System.out.println(root);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
