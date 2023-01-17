package com.hotel.hotelbooking;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataBaseSeeder implements CommandLineRunner {
	private BookingRepository bookingRepository;

	@Autowired
	public DataBaseSeeder(BookingRepository bookingRepository) {
		this.bookingRepository = bookingRepository;
	}

	@Override
	public void run(String... args) throws Exception {
		List<HotelBooking> bookings = new ArrayList<>();

		bookings.add(new HotelBooking("A", 20, 2));
		bookings.add(new HotelBooking("B", 50, 3));
		bookings.add(new HotelBooking("C", 100, 4));
		bookings.add(new HotelBooking("D", 200, 5));

		bookingRepository.saveAll(bookings);
	}
}
