package com.r4s.photoapp.api.users.ui.services;

import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;

import com.r4s.photoapp.api.users.data.UserEntity;
import com.r4s.photoapp.api.users.data.UserRepository;
import com.r4s.photoapp.api.users.shared.UserDto;


public class UsersServiceImpl implements UsersService {
	
	UserRepository usersRepository;
	
	@Autowired
	public UsersServiceImpl(UserRepository usersRepository) {
		this.usersRepository = usersRepository;
	}
	
	@Override
	public UserDto createUser(UserDto userDetails) {
		
		userDetails.setUserId(UUID.randomUUID().toString());
		ModelMapper modelMapper = new ModelMapper();
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		
		UserEntity userEntity = modelMapper.map(userDetails, UserEntity.class);
		userEntity.setEncryptedPassword("test");
		
		usersRepository.save(userEntity);
		
		UserDto returnValue = modelMapper.map(userEntity, UserDto.class);
		
		return returnValue;
	}

}
