package com.paulocanale.controller;

import com.paulocanale.model.Item;
import com.paulocanale.service.ItemService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * REST Controller for managing Item entities.
 * 
 * This controller handles HTTP requests and maps them to appropriate service layer operations.
 * It provides endpoints for CRUD operations on items.
 * 
 * Author: Paulo Canale <paulocanale@me.com>
 */
@RestController
@RequestMapping("/items")
public class ItemController {

    private final ItemService itemService;

    /**
     * Constructor to inject the ItemService dependency.
     * 
     * @param itemService the service layer instance for handling business logic
     */
    @Autowired
    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    /**
     * Handles GET requests to retrieve all items.
     * 
     * @return a list of all items
     */
    @GetMapping
    public List<Item> getAllItems() {
        return itemService.findAllItems();
    }

    /**
     * Handles GET requests to retrieve a single item by its ID.
     * 
     * @param id the ID of the item to retrieve
     * @return the item if found, or a 404 response if not found
     */
    @GetMapping("/{id}")
    public ResponseEntity<Item> getItemById(@PathVariable String id) {
        Optional<Item> item = itemService.findItemById(id);
        return item.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    /**
     * Handles POST requests to create a new item.
     * 
     * @param item the item to create
     * @return the created item
     */
    @PostMapping
    public Item createItem(@RequestBody Item item) {
        return itemService.saveItem(item);
    }

    /**
     * Handles DELETE requests to remove an item by its ID.
     * 
     * @param id the ID of the item to delete
     * @return a 204 No Content response
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteItem(@PathVariable String id) {
        itemService.deleteItemById(id);
        return ResponseEntity.noContent().build();
    }
}
