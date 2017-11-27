package com.ashlab.mongolab.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class DbSeeder implements CommandLineRunner {
	@Autowired
	private HotelRepository hotelRepository;

	public DbSeeder(HotelRepository hotelRepository) {
		this.hotelRepository = hotelRepository;
	}

	@Override
	public void run(String... arg0) throws Exception {
		Hotel marriot = new Hotel(
				"Marriot",130,
				new Address("Paris","France"),
				Arrays.asList(
						new Review("John",6,false),
						new Review("Mary",8, true),
						new Review("Alice",9, true)));

		Hotel taj = new Hotel(
				"Taj",90,
				new Address("Mumbai","India"),
				Arrays.asList(
						new Review("John",9,true),
						new Review("Deepa",5, false)
				));

		Hotel sand = new Hotel(
				"SunNSand",170,
				new Address("Pune","India"),
				new ArrayList<>()
		);

//		drop all hotels
		this.hotelRepository.deleteAll();

//		add our hotels to database
		List<Hotel> hotelList = Arrays.asList(marriot,taj,sand);
		this.hotelRepository.save(hotelList);

	}

}
