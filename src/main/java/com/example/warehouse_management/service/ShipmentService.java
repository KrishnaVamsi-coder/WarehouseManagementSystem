package com.example.warehouse_management.service;

import com.example.warehouse_management.model.Shipment;
import com.example.warehouse_management.repository.ShipmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;
import java.util.List;

@Service
public class ShipmentService {
    @Autowired
    private ShipmentRepository shipmentRepository;

    // Create or save shipment
    public Shipment saveShipment(Shipment shipment) {
        return shipmentRepository.save(shipment);
    }

    // Get shipment by ID
    public Optional<Shipment> getShipmentById(Long shipmentId) {
        return shipmentRepository.findById(shipmentId);
    }

    // Get all shipments
    public List<Shipment> getAllShipments() {
        return shipmentRepository.findAll();
    }

    // Delete shipment by ID
    public void deleteShipmentById(Long shipmentId) {
        shipmentRepository.deleteById(shipmentId);
    }

    // Update shipment status (User Story 4)
    public Shipment updateShipmentStatus(Long shipmentId, String status) {
        Shipment shipment = shipmentRepository.findById(shipmentId)
            .orElseThrow(() -> new IllegalArgumentException("Shipment not found"));
        shipment.setStatus(status);
        return shipmentRepository.save(shipment);
    }
}
