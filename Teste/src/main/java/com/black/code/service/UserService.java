package com.black.code.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.black.code.dto.UserDTO;
import com.black.code.entities.User;
import com.black.code.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public UserDTO findById(Long id) {
		User entity = repository.findById(id).get();
		UserDTO dto = new UserDTO(entity);
		return dto;
	}
}
