package com.paulocanale.repository;

import com.paulocanale.model.Item;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Repository interface for Item entities.
 * 
 * This interface extends MongoRepository, providing CRUD operations for the
 * `items` collection
 * in MongoDB. It leverages Spring Data MongoDB to abstract database
 * interactions.
 * 
 * Author: Paulo Canale <paulocanale@me.com>
 */
public interface ItemRepository extends MongoRepository<Item, String> {
    // Additional custom queries can be added here if needed.
}