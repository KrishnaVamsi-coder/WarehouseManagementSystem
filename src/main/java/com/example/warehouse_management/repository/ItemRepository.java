package com.example.warehouse_management.repository;

import com.example.warehouse_management.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> { }
