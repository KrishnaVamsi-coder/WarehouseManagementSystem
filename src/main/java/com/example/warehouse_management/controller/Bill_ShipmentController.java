package com.example.warehouse_management.controller;

import com.example.warehouse_management.model.Bill_Shipment;
import com.example.warehouse_management.service.Bill_ShipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/bill_shipments")
public class Bill_ShipmentController {
    @Autowired
    private Bill_ShipmentService billShipmentService;

    @PostMapping
    public Bill_Shipment createBillShipment(@RequestBody Bill_Shipment billShipment) {
        return billShipmentService.saveBillShipment(billShipment);
    }

    @GetMapping("/{id}")
    public Optional<Bill_Shipment> getBillShipment(@PathVariable Long id) {
        return billShipmentService.getBillShipmentById(id);
    }

    @GetMapping
    public List<Bill_Shipment> getAllBillShipments() {
        return billShipmentService.getAllBillShipments();
    }

    @DeleteMapping("/{id}")
    public void deleteBillShipment(@PathVariable Long id) {
        billShipmentService.deleteBillShipmentById(id);
    }
}
