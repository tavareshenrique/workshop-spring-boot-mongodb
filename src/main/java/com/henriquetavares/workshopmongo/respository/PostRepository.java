package com.henriquetavares.workshopmongo.respository;

import com.henriquetavares.workshopmongo.domain.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post, String> {
}
