package com.example.SeatLocker.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.SeatLocker.entities.Bookings;

public interface BookingRepo extends CrudRepository<Bookings, Long> {

}
