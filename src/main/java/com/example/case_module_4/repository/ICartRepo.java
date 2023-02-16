package com.example.case_module_4.repository;

import com.example.case_module_4.model.Account;
import com.example.case_module_4.model.Cartdetail;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface ICartRepo extends PagingAndSortingRepository<Cartdetail, Integer> {
    long deleteByAccount(Account account);
    @Query("select c from Cartdetail c where c.idCartdetail = ?1")
    Cartdetail findByIdCartdetail(int idCartdetail);
    List<Cartdetail> findAllByAccount_Username(String username);


    void deleteAllByAccount(Account account);


}
