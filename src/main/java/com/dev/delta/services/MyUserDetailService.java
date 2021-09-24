package com.dev.delta.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.dev.delta.entities.User;
import com.dev.delta.middleware.UserPrincipal;
import com.dev.delta.repositories.UserRepository;


@Service
public class MyUserDetailService implements UserDetailsService {

	/**
	 * userRepository
	 */
	@Autowired
	UserRepository userRepository;
	
	/**
	 * loadUserByUsername
	 * @param username
	 * @return UserDetails
	 * @throws UsernameNotFoundException
	 */
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user=userRepository.findByUsername(username);
		
		if(user==null)
		{
			throw new UsernameNotFoundException("user not found !");
		}
		return new UserPrincipal(user);
	}

}
