package com.example.case_module_4.repository;

import com.example.case_module_4.model.Comment;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICommentRepo extends PagingAndSortingRepository<Comment, Integer> {
    List<Comment> findAllByProduct_IdProduct(int idProduct);
}
