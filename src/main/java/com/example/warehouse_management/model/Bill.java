package com.example.warehouse_management.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.time.LocalDate;

@Entity
public class Bill {
    @Id
    private Long billId;
    private Long shipmentId;
    private LocalDate billDate;
    private Double amount;

    public Bill() {}

    public Bill(Long billId, Long shipmentId, LocalDate billDate, Double amount) {
        this.billId = billId;
        this.shipmentId = shipmentId;
        this.billDate = billDate;
        this.amount = amount;
    }

    public Long getBillId() { return billId; }
    public void setBillId(Long billId) { this.billId = billId; }
    public Long getShipmentId() { return shipmentId; }
    public void setShipmentId(Long shipmentId) { this.shipmentId = shipmentId; }
    public LocalDate getBillDate() { return billDate; }
    public void setBillDate(LocalDate billDate) { this.billDate = billDate; }
    public Double getAmount() { return amount; }
    public void setAmount(Double amount) { this.amount = amount; }
}
