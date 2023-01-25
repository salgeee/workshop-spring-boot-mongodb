package com.leonardosalge.workshopmongodb.services;

import com.leonardosalge.workshopmongodb.domain.User;
import com.leonardosalge.workshopmongodb.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {


    @Autowired
    private UserRepository repo;


    public List<User> findAll(){
        return repo.findAll();
    }
}
