package com.example.warehouse_management.controller;

import com.example.warehouse_management.model.Shipment;
import com.example.warehouse_management.service.ShipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/shipments")
public class ShipmentController {
    @Autowired
    private ShipmentService shipmentService;

    // Create new shipment
    @PostMapping
    public Shipment createShipment(@RequestBody Shipment shipment) {
        return shipmentService.saveShipment(shipment);
    }

    // Get all shipments
    @GetMapping
    public List<Shipment> getAllShipments() {
        return shipmentService.getAllShipments();
    }

    // Get shipment by ID
    @GetMapping("/{id}")
    public Optional<Shipment> getShipment(@PathVariable Long id) {
        return shipmentService.getShipmentById(id);
    }

    // Delete shipment by ID
    @DeleteMapping("/{id}")
    public void deleteShipment(@PathVariable Long id) {
        shipmentService.deleteShipmentById(id);
    }

    // Update shipment status
    @PutMapping("/{id}/status")
    public Shipment updateShipmentStatus(@PathVariable Long id, @RequestParam String status) {
        return shipmentService.updateShipmentStatus(id, status);
    }
}
