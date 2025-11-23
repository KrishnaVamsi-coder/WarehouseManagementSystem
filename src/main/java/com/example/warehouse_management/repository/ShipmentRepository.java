package com.example.warehouse_management.repository;

import com.example.warehouse_management.model.Shipment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShipmentRepository extends JpaRepository<Shipment, Long> { }
