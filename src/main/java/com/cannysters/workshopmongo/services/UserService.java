package com.cannysters.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cannysters.workshopmongo.domain.User;
import com.cannysters.workshopmongo.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repositorio;
	
	public List<User> findaAll(){	
		return repositorio.findAll();
	}
}