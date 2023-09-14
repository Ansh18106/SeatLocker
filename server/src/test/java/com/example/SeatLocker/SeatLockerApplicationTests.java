package com.example.SeatLocker;

import com.example.SeatLocker.entities.Cinemas;
import com.example.SeatLocker.entities.Users;
import com.example.SeatLocker.entities.enums.UserType;
import com.example.SeatLocker.repositories.CinemasRepo;
import com.example.SeatLocker.repositories.UsersRepo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class SeatLockerApplicationTests {

	@Autowired
	private UsersRepo usersRepo;
	@Autowired
	private CinemasRepo cinemasRepo;

	@Test
	public void testCreateUser(){
		Users user = new Users();
		user.setUserName("Ansh");
		user.setPassword("password");
		user.setEmail("anshbansal18106@gmail.com");
		user.setUserType(UserType.ADMIN);
		this.usersRepo.save(user);
	}


	@Test
	public void testCreateCinema(){
		Cinemas cinema = new Cinemas();
		cinema.setName("Main Hoon Na");
		cinema.setLocation("Agra");
		cinema.setNumberOfScreens(4);
		this.cinemasRepo.save(cinema);
	}

	@Test
	public void testFindCinemaById(){
		List<Cinemas> cinemas = (List<Cinemas>) cinemasRepo.findAll();
		for (Cinemas cinema: cinemas) {
			System.out.println(cinema);
		}
	}

}
