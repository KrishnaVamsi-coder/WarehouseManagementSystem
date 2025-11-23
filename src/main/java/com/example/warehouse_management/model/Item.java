package com.example.warehouse_management.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.PositiveOrZero;

@Entity
public class Item {
    @Id
    private Long id;
    private String name;

    @PositiveOrZero(message = "Quantity cannot be negative")
    private Integer quantity;

    public Item() {}

    public Item(Long id, String name, Integer quantity) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public Integer getQuantity() { return quantity; }
    public void setQuantity(Integer quantity) { this.quantity = quantity; }
}
