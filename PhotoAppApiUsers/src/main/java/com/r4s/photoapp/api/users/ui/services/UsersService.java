package com.r4s.photoapp.api.users.ui.services;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.r4s.photoapp.api.users.shared.UserDto;

public interface UsersService extends UserDetailsService {
	
	UserDto createUser(UserDto userDetails);
}
