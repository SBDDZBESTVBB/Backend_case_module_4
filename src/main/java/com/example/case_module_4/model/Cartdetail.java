package com.example.case_module_4.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data

public class Cartdetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCartdetail;
    @ManyToOne
    private Product product;
    @ManyToOne
    private  Account account;
    private int amount;

}
