package com.prog.BusBooking.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

import com.prog.BusBooking.DTO.BookingsDTO;
import com.prog.BusBooking.DTO.UserRegisteredDTO;
import com.prog.BusBooking.model.Bookings;
import com.prog.BusBooking.model.User;

public interface DefaultUserService extends UserDetailsService{

	User save(UserRegisteredDTO userRegisteredDTO);

	Bookings updateBookings(BookingsDTO bookingDTO,UserDetails user);
	
	void sendEmail(BookingsDTO bookingDTO, User users, String nameGenrator);


	
}
