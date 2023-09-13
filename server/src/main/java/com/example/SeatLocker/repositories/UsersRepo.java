package com.example.SeatLocker.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.SeatLocker.entities.Users;

import java.util.Optional;

public interface UsersRepo extends CrudRepository<Users, Long> {

    Optional<Users> findUserByEmail(String email);
}
