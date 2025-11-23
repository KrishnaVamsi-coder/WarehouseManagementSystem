package com.example.warehouse_management.service;

import com.example.warehouse_management.model.Bill_Shipment;
import com.example.warehouse_management.repository.Bill_ShipmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class Bill_ShipmentService {
    @Autowired
    private Bill_ShipmentRepository billShipmentRepository;

    public Bill_Shipment saveBillShipment(Bill_Shipment billShipment) {
        return billShipmentRepository.save(billShipment);
    }

    public Optional<Bill_Shipment> getBillShipmentById(Long id) {
        return billShipmentRepository.findById(id);
    }

    public void deleteBillShipmentById(Long id) {
        billShipmentRepository.deleteById(id);
    }

    public List<Bill_Shipment> getAllBillShipments() {
        return billShipmentRepository.findAll();
    }
}
