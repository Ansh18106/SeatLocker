package com.example.SeatLocker.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.SeatLocker.entities.Seats;

public interface SeatsRepo extends CrudRepository<Seats, Long> {

}
