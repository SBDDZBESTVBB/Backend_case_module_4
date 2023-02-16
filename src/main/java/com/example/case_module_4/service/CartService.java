package com.example.case_module_4.service;

import com.example.case_module_4.model.Cartdetail;
import com.example.case_module_4.repository.ICartRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartService {
    @Autowired
    ICartRepo iCartRepo;
    public void saveCartdetail(Cartdetail cartdetail){
        iCartRepo.save(cartdetail);
    }
    public List<Cartdetail> findAllCartdetailByUsername(String username){
        return iCartRepo.findAllByAccount_Username(username);
    }
    public Cartdetail findById(int id){
        return iCartRepo.findByIdCartdetail(id);
    }

    public void deleteCartdetailByid(int id){
        iCartRepo.deleteById(id);
    }
}
