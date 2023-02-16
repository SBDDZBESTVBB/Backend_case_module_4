package com.example.case_module_4.controller.bill;

import com.example.case_module_4.model.Bill;
import com.example.case_module_4.model.BillDetails;
import com.example.case_module_4.model.Cartdetail;
import com.example.case_module_4.model.Product;
import com.example.case_module_4.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@CrossOrigin("*")

@RestController

@RequestMapping("/bill")

public class BillController {
    @Autowired
    BillService billService;
    @Autowired
    CartService cartService;
    @Autowired
    BillDetailsService billDetailsService;
    @Autowired
    AccountService accountService;
    @Autowired
    ProductService productService;
@PostMapping("/{username}")
    public Bill createBill(@PathVariable String username){
    List<Cartdetail> cartdetails = cartService.findAllCartdetailByUsername(username);
    Bill bill = new Bill();
    bill.setAccount(accountService.findAccountByUsername(username));
    LocalDate date = LocalDate.now() ;
    bill.setDate(date);
    billService.saveBill(bill);
    List<Bill> bills = billService.findAllBillByUsername(username);
    Bill bill1 = bills.get(bills.size()-1);
    for (int i = 0; i < cartdetails.size(); i++) {
        BillDetails billDetail = new BillDetails();
        billDetail.setBill(bill1);
        billDetail.setProduct(cartdetails.get(i).getProduct());
        billDetail.setAmount(cartdetails.get(i).getAmount());
        billDetailsService.saveBillDetails(billDetail);
        Product product = cartdetails.get(i).getProduct();
        product.setQuantity(product.getQuantity()-cartdetails.get(i).getAmount());
        productService.saveProduct(product);
        cartService.deleteCartdetailByid(cartdetails.get(i).getIdCartdetail());
    }


    return bill1;
}

}
