package com.r4s.photoapp.api.users.shared;

import java.io.Serializable;

import lombok.Data;

@Data
public class UserDto implements Serializable {
	
	private static final long serialVersionUID = -5715260763009680909L;
	
	private String firstName;
	private String lastName;
	private String password;
	private String email;
	private String userId;
	private String encryptedPassword;

}
