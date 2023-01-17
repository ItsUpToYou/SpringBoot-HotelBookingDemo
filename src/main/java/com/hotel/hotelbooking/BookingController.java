package com.hotel.hotelbooking;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/booking")
public class BookingController {

	private BookingRepository bookingRepository;

	public BookingController(BookingRepository bookingRepository) {
		this.bookingRepository = bookingRepository;
	}

	@GetMapping("/getList")
	public List<HotelBooking> getBookingList() {
		return bookingRepository.findAll();
	}

	@GetMapping("/priceLesThan/{price}")
	public List<HotelBooking> getpriceLesThan(@PathVariable double price) {
		return bookingRepository.findByPricePerNightLessThan(price);
	}

	@PostMapping("/create")
	public List<HotelBooking> createHotel(@RequestBody HotelBooking newHotel) {
		bookingRepository.save(newHotel);
		return bookingRepository.findAll();
	}

	@PostMapping("/delete/{id}")
	public List<HotelBooking> deleteById(@PathVariable long id) {
		bookingRepository.deleteById(id);
		return bookingRepository.findAll();
	}
}
