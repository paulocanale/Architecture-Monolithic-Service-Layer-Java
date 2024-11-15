package com.paulocanale.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Represents an Item entity in the system.
 * 
 * This class is annotated with @Document to map it to the MongoDB collection
 * `items`.
 * Each item has a unique identifier, a name, and a description.
 * 
 * Author: Paulo Canale <paulocanale@me.com>
 */
@Document(collection = "items")
public record Item(@Id String id, String name, String description) {
    // This record encapsulates item properties in an immutable way.
}

// package com.paulocanale.model;

// import org.springframework.data.annotation.Id;
// import org.springframework.data.mongodb.core.mapping.Document;

// @Document(collection = "items")
// public class Item {
// @Id
// private String id;
// private String name;
// private String description;
// public String getId() {
// return id;
// }
// public void setId(String id) {
// this.id = id;
// }
// public String getName() {
// return name;
// }
// public void setName(String name) {
// this.name = name;
// }
// public String getDescription() {
// return description;
// }
// public void setDescription(String description) {
// this.description = description;
// }
// }
