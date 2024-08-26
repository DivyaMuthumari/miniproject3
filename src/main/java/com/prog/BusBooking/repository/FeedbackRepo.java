package com.prog.BusBooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prog.BusBooking.model.Feedback;

public interface FeedbackRepo extends JpaRepository<Feedback, Integer>{

}
