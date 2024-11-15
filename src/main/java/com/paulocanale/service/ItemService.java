package com.paulocanale.service;

import com.paulocanale.model.Item;
import com.paulocanale.repository.ItemRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Service layer for managing Item entities.
 * 
 * This class provides business logic for creating, retrieving, and deleting
 * items. It interacts
 * with the repository layer to persist and query data.
 * 
 * Author: Paulo Canale <paulocanale@me.com>
 */
@Service
public class ItemService {

    private final ItemRepository itemRepository;

    /**
     * Constructor to inject the ItemRepository dependency.
     * 
     * @param itemRepository the repository instance for interacting with the
     *                       database
     */
    @Autowired
    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    /**
     * Retrieves all items from the database.
     * 
     * @return a list of all items
     */
    public List<Item> findAllItems() {
        return itemRepository.findAll();
    }

    /**
     * Retrieves a single item by its ID.
     * 
     * @param id the ID of the item to retrieve
     * @return an Optional containing the item if found, or empty if not found
     */
    public Optional<Item> findItemById(String id) {
        return itemRepository.findById(id);
    }

    /**
     * Saves a new item to the database.
     * 
     * @param item the item to save
     * @return the saved item
     */
    public Item saveItem(Item item) {
        return itemRepository.save(item);
    }

    /**
     * Deletes an item from the database by its ID.
     * 
     * @param id the ID of the item to delete
     */
    public void deleteItemById(String id) {
        itemRepository.deleteById(id);
    }
}