package com.diogocosta.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.diogocosta.demo.domain.User;
import com.diogocosta.demo.repository.UserRepository;

@Service
public class UserServices {

    @Autowired
    private UserRepository repo;

    public List<User> findAll() {
        for (User user : repo.findAll()) {
            System.out.println(user);
        }
        return repo.findAll();
    }

}
