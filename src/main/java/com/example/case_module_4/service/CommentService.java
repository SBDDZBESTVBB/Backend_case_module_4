package com.example.case_module_4.service;

import com.example.case_module_4.model.Comment;
import com.example.case_module_4.repository.ICommentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class CommentService {
    @Autowired
    ICommentRepo commentRepo;

    public List<Comment> getAllCommentByIdProduct(int id) {
        return commentRepo.findAllByProduct_IdProduct(id);
    }

}
