package com.api.peolpesearcher.security.services;

import com.api.peolpesearcher.models.User;
import com.api.peolpesearcher.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserService {
    private final UserRepo userRepo;
@Autowired
    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }
//     public User addUser(User user) {
//        user.setUserCode(UUID.randomUUID().toString());
//        return userRepo.save(user);
//     }
     public List<User> findAllUsers() {
        return (List<User>) userRepo.findAll();
     }
    public User updateUser(User user) {
        return userRepo.save(user);
    }
    public User findUserById(Long id) {
        return  userRepo.findUserById(id).get();
    }


    public void deleteUser(Long id) {
        userRepo.deleteUserById(id);
    }
}

