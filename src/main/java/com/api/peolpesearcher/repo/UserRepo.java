package com.api.peolpesearcher.repo;

import com.api.peolpesearcher.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {
    void deleteUserById(Long id); //making query by method name
    Optional<User> findByName(String name);

    Boolean existsByName(String name);

    Boolean existsByEmail(String email);
    Optional<User> findUserById(Long id);
}
