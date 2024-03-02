package com.workintech.ecommerce.service;

import com.workintech.ecommerce.dto.RegisterResponse;
import com.workintech.ecommerce.entity.User;

import java.util.List;

public interface UserServiceInterface {

    public RegisterResponse findById(Long id);

    public List<User> findAll();

    public User findByUser(Long id);
    public RegisterResponse delete(Long id);
}
