package com.example.case_module_4.controller.cart;

import com.example.case_module_4.model.Account;
import com.example.case_module_4.model.Cartdetail;
import com.example.case_module_4.model.Product;
import com.example.case_module_4.service.AccountService;
import com.example.case_module_4.service.CartService;
import com.example.case_module_4.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")

@RestController

@RequestMapping("/cart")

public class CartController {
    @Autowired
    CartService cartService;
    @Autowired
    ProductService productService;
    @Autowired
    AccountService accountService;

    @PostMapping()
    public void saveCartdetail(@RequestBody Cartdetail cartdetail){
        Cartdetail cartdetail1 = new Cartdetail();
        Product product1 = productService.findById(cartdetail.getProduct().getIdProduct());
        Account account1 = accountService.findAccountByUsername(cartdetail.getAccount().getUsername());
        int amount1 = cartdetail.getAmount();
        cartdetail1.setAmount(amount1);
        cartdetail1.setAccount(account1);
        cartdetail1.setProduct(product1);
         cartService.saveCartdetail(cartdetail1);
    }
    @GetMapping("/{username}")
    public List<Cartdetail> findallCartdetailsByusername(@PathVariable String username){
        return cartService.findAllCartdetailByUsername(username);
    }
    @PostMapping  ("/{idCartDetails}")
    public void deleteCartDetails(@PathVariable int idCartDetails){
        cartService.deleteCartdetailByid(idCartDetails);
    }
}
