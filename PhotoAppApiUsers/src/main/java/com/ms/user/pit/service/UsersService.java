package com.ms.user.pit.service;


import org.springframework.security.core.userdetails.UserDetailsService;

import com.ms.user.pit.shared.UserDto;

public interface UsersService extends UserDetailsService {
	UserDto createUser(UserDto userDetails);
	UserDto getUserDetailsByEmail(String email);
	//UserDto getUserByUserId(String userId);
}
