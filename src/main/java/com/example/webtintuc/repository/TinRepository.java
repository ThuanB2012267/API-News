package com.example.webtintuc.repository;

import com.example.webtintuc.model.TinModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.Optional;

public interface TinRepository extends MongoRepository<TinModel, String> {
    @Query("{'name': ?@}")
    Optional<TinModel> findByName(String name);
}
