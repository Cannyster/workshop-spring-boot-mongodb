package com.cannysters.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cannysters.workshopmongo.domain.Post;
import com.cannysters.workshopmongo.repository.PostRepository;
import com.cannysters.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class PostService {

	@Autowired
	private PostRepository repositorio;

	public Post findById(String id) {
		Optional<Post> obj = repositorio.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
	
	public List<Post> findByTitle(String text){
		return repositorio.serchTitle(text);
	}

}
