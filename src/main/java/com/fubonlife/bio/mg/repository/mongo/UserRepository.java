package com.fubonlife.bio.mg.repository.mongo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.fubonlife.bio.mg.entity.mongo.User;;


@Repository
public interface UserRepository extends MongoRepository<User, String> {
	List<User> findByName(String name);
}

