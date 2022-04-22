package com.example.springsocial.security;

import com.example.springsocial.exception.BadRequestException;
import com.example.springsocial.model.User;
import com.example.springsocial.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Configurable
public class AuthenticationManager {

    @Autowired
    private UserRepository userRepository;

    private static PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    private Map<Integer, User> userMap;
    private int nextSessionId;
    public AuthenticationManager() {
        this.userMap =  new HashMap<>();
        this.nextSessionId = nextSessionId = 0;
    }


    public int authenticate(String email, String password){
        int id;
        User u = userRepository.findByEmail(email).orElseThrow(()->new BadRequestException("Email or Password wrong") );
        if(passwordEncoder.matches(password, u.getPassword())){
            id = nextSessionId++;
            userMap.put(id, u);
            return id;
        }else
            throw new BadRequestException("Email or Password wrong");

    }

    public User getUser(int id){
        return userMap.get(id);
    }

}
