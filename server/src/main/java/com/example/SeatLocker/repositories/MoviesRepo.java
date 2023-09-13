package com.example.SeatLocker.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.SeatLocker.entities.Movies;

public interface MoviesRepo extends CrudRepository<Movies, Long> {

}
