package com.r4s.photoapp.api.users.ui.services;

import java.util.UUID;

import com.r4s.photoapp.api.users.shared.UserDto;

public class UsersServiceImpl implements UsersService {

	@Override
	public UserDto createUser(UserDto userDetails) {
		
		userDetails.setUserId(UUID.randomUUID().toString());
		
		return null;
	}

}
