package com.example.case_module_4.service;

import com.example.case_module_4.model.Bill;
import com.example.case_module_4.model.BillDetails;
import com.example.case_module_4.repository.IBillDetailsRepo;
import com.example.case_module_4.repository.IBillRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class BillDetailsService {
@Autowired
    IBillDetailsRepo iBillDetailsRepo;
public void saveBillDetails(BillDetails billDetails){
    iBillDetailsRepo.save(billDetails);
}
}
