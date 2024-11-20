package com.codewithProjects.Car_Rental_Spring.services.jwt;

import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Component;



public interface UserService {

    UserDetailsService userDetailsService();
}
