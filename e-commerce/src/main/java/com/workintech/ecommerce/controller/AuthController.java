package com.workintech.ecommerce.controller;

import com.workintech.ecommerce.dto.RegisterResponse;
import com.workintech.ecommerce.dto.RegisterUserDto;
import com.workintech.ecommerce.entity.User;
import com.workintech.ecommerce.service.AuthenticationService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@Validated
@RestController
@RequestMapping("/auth")
public class AuthController {
    private AuthenticationService authenticationService;
@Autowired
    public AuthController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @PostMapping("/register")
    public RegisterResponse register(@Valid @RequestBody User user){
   User responseUser=  authenticationService.register(user.getEmail(), user.getFirstName(), user.getLastName(),
             user.getPassword(), user.getPhone(), user.getRole());

     return new RegisterResponse(responseUser.getId(), responseUser.getEmail(),
             responseUser.getFirstName(), responseUser.getLastName(),
             responseUser.getRole(), responseUser.getRoles());

    }

}
