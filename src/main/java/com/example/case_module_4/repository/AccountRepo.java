package com.example.case_module_4.repository;

import com.example.case_module_4.model.Account;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface AccountRepo extends PagingAndSortingRepository<Account,Integer> {
}
