package com.hotel.hotelbooking;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class HotelBooking {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String hotelName;
	private double pricePerNight;
	private int numbOfNights;

	public HotelBooking() {
	}

	public HotelBooking(String hotelName, double pricePerNight, int nOfNights) {
		this.hotelName = hotelName;
		this.pricePerNight = pricePerNight;
		this.numbOfNights = nOfNights;
	}

	public long getId() {
		return id;
	}

	public String getHotelName() {
		return hotelName;
	}

	public double getPricePerNight() {
		return pricePerNight;
	}

	public int getNumbOfNights() {
		return numbOfNights;
	}

	public double getTotalPrice() {
		return numbOfNights * pricePerNight;
	}

	 
}
