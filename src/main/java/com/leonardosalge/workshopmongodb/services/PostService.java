package com.leonardosalge.workshopmongodb.services;

import com.leonardosalge.workshopmongodb.domain.Post;
import com.leonardosalge.workshopmongodb.domain.User;
import com.leonardosalge.workshopmongodb.dto.UserDTO;
import com.leonardosalge.workshopmongodb.repository.PostRepository;
import com.leonardosalge.workshopmongodb.repository.UserRepository;
import com.leonardosalge.workshopmongodb.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {


    @Autowired
    private PostRepository repo;




    public Post findById(String id){
        Optional<Post> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

    public List<Post> findByTitle(String text) {
        return repo.findByTitleContainingIgnoreCase(text);
    }

}
