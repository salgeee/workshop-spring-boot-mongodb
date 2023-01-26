package com.leonardosalge.workshopmongodb.repository;

import com.leonardosalge.workshopmongodb.domain.Post;
import com.leonardosalge.workshopmongodb.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {
}
