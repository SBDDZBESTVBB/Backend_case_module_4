package com.example.case_module_4.repository;

import com.example.case_module_4.model.BillDetails;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IBillDetailsRepo extends PagingAndSortingRepository<BillDetails, Integer> {
}
