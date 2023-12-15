package com.cannysters.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cannysters.workshopmongo.domain.User;
import com.cannysters.workshopmongo.repository.UserRepository;
import com.cannysters.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository repositorio;
	
	public List<User> findaAll(){	
		return repositorio.findAll();
	}

	public User findById(String id) {
		Optional<User> obj = repositorio.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}



}
