package com.workintech.ecommerce.dto;

import com.workintech.ecommerce.entity.Role;

import java.util.Set;

public record RegisterResponse(long id,String email, String firstName,
                               String lastName, String role, Set<Role> roles ) {
}
