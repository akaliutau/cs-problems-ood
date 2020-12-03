package com.design.patterns.converter;

import java.io.Serializable;

public class UserDto implements Serializable {
    private static final long serialVersionUID = -1929182712519153036L;

    private final String firstName;
    private final String lastName;
    
    public UserDto(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

     public String getLastName() {
        return lastName;
    }
 
}

