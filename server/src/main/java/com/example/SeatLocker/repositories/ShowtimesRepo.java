package com.example.SeatLocker.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.SeatLocker.entities.Showtimes;

public interface ShowtimesRepo extends CrudRepository<Showtimes, Long> {

}
