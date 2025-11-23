package com.example.warehouse_management.controller;

import com.example.warehouse_management.model.Bill;
import com.example.warehouse_management.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/bills")
public class BillController {
    @Autowired
    private BillService billService;

    // Create new bill
    @PostMapping
    public Bill createBill(@RequestBody Bill bill) {
        return billService.saveBill(bill);
    }

    // Get bill by ID
    @GetMapping("/{id}")
    public Optional<Bill> getBill(@PathVariable Long id) {
        return billService.getBillById(id);
    }

    // Delete bill by ID
    @DeleteMapping("/{id}")
    public void deleteBill(@PathVariable Long id) {
        billService.deleteBillById(id);
    }

    // Get all bills for a given month: /bills/month?year=2025&month=11
    @GetMapping("/month")
    public List<Bill> getBillsForMonth(@RequestParam int year, @RequestParam int month) {
        return billService.getBillsForMonth(year, month);
    }

    // Get total amount for a month: /bills/month/total?year=2025&month=11
    @GetMapping("/month/total")
    public double getTotalForMonth(@RequestParam int year, @RequestParam int month) {
        return billService.getTotalAmountForMonth(year, month);
    }

    // Download or print function for report (returns bills; extend per UI need)
    @GetMapping("/month/download")
    public List<Bill> downloadMonthlyReport(@RequestParam int year, @RequestParam int month) {
        return billService.getBillsForMonth(year, month);
    }
}
