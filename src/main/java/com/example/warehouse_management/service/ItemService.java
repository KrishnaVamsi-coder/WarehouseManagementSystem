package com.example.warehouse_management.service;

import com.example.warehouse_management.model.Item;
import com.example.warehouse_management.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ItemService {
    @Autowired
    private ItemRepository itemRepository;

    public Item saveItem(Item item) {
        if(item.getQuantity() < 0)
            throw new IllegalArgumentException("Quantity cannot be negative");
        return itemRepository.save(item);
    }

    public Optional<Item> getItemById(Long id) {
        return itemRepository.findById(id);
    }

    public void deleteItemById(Long id) {
        itemRepository.deleteById(id);
    }

    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }

    public Item updateItemQuantity(Long id, int newQuantity) {
        if (newQuantity < 0)
            throw new IllegalArgumentException("Quantity cannot be negative");
        Item item = itemRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Item not found"));
        item.setQuantity(newQuantity);
        return itemRepository.save(item);
    }
}
