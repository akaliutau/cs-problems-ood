package com.design.patterns.converter;

public class UserConverter extends Converter<User, UserDto>{

    @Override
    UserDto from(User user) {
        return new UserDto(user.getFirstName(), user.getLastName());
    }

    @Override
    User to(UserDto dto) {
        return new User(dto.getFirstName(), dto.getLastName(), null);
    }


}
