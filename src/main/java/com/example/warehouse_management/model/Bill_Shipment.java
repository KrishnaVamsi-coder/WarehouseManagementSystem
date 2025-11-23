package com.example.warehouse_management.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Bill_Shipment {
    @Id
    private Long billShipmentId;

    @OneToOne
    @JoinColumn(name = "shipment_id")
    private Shipment shipment;

    private LocalDate billDate;
    private Double amount;

    public Bill_Shipment() {}

    public Bill_Shipment(Long billShipmentId, Shipment shipment, LocalDate billDate, Double amount) {
        this.billShipmentId = billShipmentId;
        this.shipment = shipment;
        this.billDate = billDate;
        this.amount = amount;
    }

    public Long getBillShipmentId() { return billShipmentId; }
    public void setBillShipmentId(Long billShipmentId) { this.billShipmentId = billShipmentId; }
    public Shipment getShipment() { return shipment; }
    public void setShipment(Shipment shipment) { this.shipment = shipment; }
    public LocalDate getBillDate() { return billDate; }
    public void setBillDate(LocalDate billDate) { this.billDate = billDate; }
    public Double getAmount() { return amount; }
    public void setAmount(Double amount) { this.amount = amount; }
}
