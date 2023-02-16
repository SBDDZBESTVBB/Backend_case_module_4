package com.example.case_module_4.repository;

import com.example.case_module_4.model.Bill;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface IBillRepo extends PagingAndSortingRepository<Bill, Integer> {
    List<Bill> findAllByAccount_Username(String username);
}
