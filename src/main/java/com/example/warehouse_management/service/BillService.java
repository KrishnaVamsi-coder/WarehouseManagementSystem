package com.example.warehouse_management.service;

import com.example.warehouse_management.model.Bill;
import com.example.warehouse_management.repository.BillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class BillService {
    @Autowired
    private BillRepository billRepository;

    public Bill saveBill(Bill bill) {
        return billRepository.save(bill);
    }

    public Optional<Bill> getBillById(Long billId) {
        return billRepository.findById(billId);
    }

    public void deleteBillById(Long billId) {
        billRepository.deleteById(billId);
    }

    public List<Bill> getBillsForMonth(int year, int month) {
        LocalDate start = LocalDate.of(year, month, 1);
        LocalDate end = start.withDayOfMonth(start.lengthOfMonth());
        return billRepository.findByBillDateBetween(start, end);
    }

    public double getTotalAmountForMonth(int year, int month) {
        return getBillsForMonth(year, month)
            .stream()
            .mapToDouble(Bill::getAmount)
            .sum();
    }
}
