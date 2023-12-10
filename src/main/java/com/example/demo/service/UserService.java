package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.UserRepository;
import com.example.demo.entity.User;

@Service
public class UserService {
    @Autowired
    UserRepository repository;

    public User getUserById(int id){
        return repository.findById(id).get();
    }

    public List<User> getAllUsers(){
        List<User> users = new ArrayList<User>();
        repository.findAll().forEach(user -> users.add(user));
        return users;
    }

    public void saveOrUpdate(User user){
        repository.save(user);
    }

    public void deleteUserById(int id){
        repository.deleteById(id);
    }
}
