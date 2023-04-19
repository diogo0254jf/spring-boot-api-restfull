package com.diogocosta.demo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.diogocosta.demo.domain.User;
import com.diogocosta.demo.services.UserServices;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
    @Autowired
    private UserServices service;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<User>> findAll() {
        List<User> list = service.findAll();
		return ResponseEntity.ok().body(list);
    }
    

}
