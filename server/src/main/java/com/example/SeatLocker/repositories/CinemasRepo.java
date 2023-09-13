package com.example.SeatLocker.repositories;

import com.example.SeatLocker.entities.Cinemas;
import org.springframework.data.repository.CrudRepository;

public interface CinemasRepo extends CrudRepository<Cinemas, Long> {
	
}
