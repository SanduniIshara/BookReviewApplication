package com.bookreview.booknook.service;

import com.bookreview.booknook.dto.UserDTO;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    String saveUser(UserDTO userDTO);
}
