package com.example.case_module_4.repository;

import com.example.case_module_4.model.Product;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ProductRepo extends PagingAndSortingRepository<Product,Integer> {
}
