package com.bookreview.booknook.service.impl;


import com.bookreview.booknook.dto.UserDTO;
import com.bookreview.booknook.entity.User;
import com.bookreview.booknook.repo.UserRepo;
import com.bookreview.booknook.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceIMPL implements UserService {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public String saveUser(UserDTO userDTO) {
        User user = modelMapper.map(userDTO, User.class);
        userRepo.save(user);
        return "Saved Successfully";
    }
}
