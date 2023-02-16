package com.example.case_module_4.service;

import com.example.case_module_4.model.Bill;
import com.example.case_module_4.repository.IBillRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class BillService {
    @Autowired
    IBillRepo iBillRepo;
    public Bill saveBill(Bill bill){
        return iBillRepo.save(bill);
    }
    public List<Bill> findAllBillByUsername(String username){
        return iBillRepo.findAllByAccount_Username(username);
    }
}
