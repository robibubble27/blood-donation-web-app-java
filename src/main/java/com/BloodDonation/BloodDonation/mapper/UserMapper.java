package com.BloodDonation.BloodDonation.mapper;

import com.BloodDonation.BloodDonation.dto.UserCreateDTO;
import com.BloodDonation.BloodDonation.dto.UserDTO;
import com.BloodDonation.BloodDonation.entity.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public User toUser(UserCreateDTO dto){
        User user =  new User();
        user.email = dto.email;
        user.password = dto.password;
        return user;
    }

    public UserDTO toUserDTO(User user){
        UserDTO dto = new UserDTO();
        dto.uuid = user.uuid;
        dto.email = user.email;
        dto.firstName = user.firstName;
        dto.lastName = user.lastName;
        return dto;
    }
}
