package com.example.warehouse_management.repository;

import com.example.warehouse_management.model.Bill;
import org.springframework.data.jpa.repository.JpaRepository;
import java.time.LocalDate;
import java.util.List;

public interface BillRepository extends JpaRepository<Bill, Long> {
    List<Bill> findByBillDateBetween(LocalDate startDate, LocalDate endDate);
}
