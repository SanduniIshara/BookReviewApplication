package com.bookreview.booknook.controller;

import com.bookreview.booknook.dto.ReviewDTO;
import com.bookreview.booknook.dto.UserDTO;
import com.bookreview.booknook.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("api/v1/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping({"/save"})
    public String saveUser(@RequestBody UserDTO userDTO) {
        String message = userService.saveUser(userDTO);
        return "saved Successfully";
    }
}
