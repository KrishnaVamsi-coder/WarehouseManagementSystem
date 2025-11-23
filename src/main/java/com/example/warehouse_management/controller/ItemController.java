package com.example.warehouse_management.controller;

import com.example.warehouse_management.model.Item;
import com.example.warehouse_management.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/items")
public class ItemController {
    @Autowired
    private ItemService itemService;

    // Get all items
    @GetMapping
    public List<Item> getAllItems() {
        return itemService.getAllItems();
    }

    // Get item by id
    @GetMapping("/{id}")
    public Optional<Item> getItem(@PathVariable Long id) {
        return itemService.getItemById(id);
    }

    // Create new item (POST)
    @PostMapping
    public Item addItem(@RequestBody Item item) {
        return itemService.saveItem(item);
    }

    // Update item by id (PUT)
    @PutMapping("/{id}")
    public Item updateItem(@PathVariable Long id, @RequestBody Item item) {
        item.setId(id);
        return itemService.saveItem(item);
    }

    // Delete item by id (DELETE)
    @DeleteMapping("/{id}")
    public void deleteItem(@PathVariable Long id) {
        itemService.deleteItemById(id);
    }

    // Update only quantity (User Story 2)
    @PutMapping("/{id}/quantity")
    public Item updateQuantity(@PathVariable Long id, @RequestParam int quantity) {
        return itemService.updateItemQuantity(id, quantity);
    }
}
