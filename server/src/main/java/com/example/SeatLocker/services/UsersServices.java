package com.example.SeatLocker.services;

import com.example.SeatLocker.entities.Users;
import com.example.SeatLocker.repositories.UsersRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class UsersServices {

    private final UsersRepo usersRepo;

    @Autowired
    public UsersServices(UsersRepo usersRepo) {
        this.usersRepo = usersRepo;
    }

    public List<Users> getUsers() {
        System.out.println((List<Users>) usersRepo.findAll());
        return (List<Users>) usersRepo.findAll();
    }

    public Users addUser(Users user) {
        System.out.println(user);
        Optional<Users> usersOptional = usersRepo.findUserByEmail(user.getEmail());
        if (usersOptional.isPresent()) {
            throw new IllegalStateException("email taken");
        }
        System.out.println(user);
        return usersRepo.save(user);
    }

    public void deleteUser(Long userId) {
        Boolean exists = usersRepo.existsById(userId);
        if (!exists) {
            throw new IllegalStateException(userId + "not found");
        }
        usersRepo.deleteById((userId));
    }

    @Transactional
    public void updateUser(Long userId, Users updatedUserData) {
		String name = updatedUserData.getUserName();
		String email = updatedUserData.getEmail();
		Users user = usersRepo.findById(userId).orElseThrow(() -> new IllegalStateException(userId + " not found"));

        if (name != null && name.length() > 0 && !Objects.equals(user.getUserName(), name)) {
            user.setUserName(name);
        }
        if (email != null && email.length() > 0 && !Objects.equals(user.getEmail(), email)) {
            Optional<Users> usersOptional = usersRepo.findUserByEmail(email);
            if (usersOptional.isPresent()) {
                throw new IllegalStateException("Email already taken");
            }
            user.setEmail(email);
        }
        usersRepo.save(user);
    }


}
