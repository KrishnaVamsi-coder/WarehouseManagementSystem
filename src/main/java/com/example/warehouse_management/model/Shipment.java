package com.example.warehouse_management.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Shipment {
    @Id
    private Long shipmentId;

    @ElementCollection
    private List<Long> itemIds; // List of Item IDs

    private LocalDate shipmentDate;

    private String status; // "pending", "dispatched", "delivered"

    public Shipment() {}

    public Shipment(Long shipmentId, List<Long> itemIds, LocalDate shipmentDate, String status) {
        this.shipmentId = shipmentId;
        this.itemIds = itemIds;
        this.shipmentDate = shipmentDate;
        this.status = status;
    }

    public Long getShipmentId() { return shipmentId; }
    public void setShipmentId(Long shipmentId) { this.shipmentId = shipmentId; }
    public List<Long> getItemIds() { return itemIds; }
    public void setItemIds(List<Long> itemIds) { this.itemIds = itemIds; }
    public LocalDate getShipmentDate() { return shipmentDate; }
    public void setShipmentDate(LocalDate shipmentDate) { this.shipmentDate = shipmentDate; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
