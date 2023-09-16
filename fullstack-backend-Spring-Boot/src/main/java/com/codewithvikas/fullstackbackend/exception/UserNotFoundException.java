package com.codewithvikas.fullstackbackend.exception;

import com.codewithvikas.fullstackbackend.model.User;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(Long id){
        super("Could not found the user with id "+ id);
    }
}
