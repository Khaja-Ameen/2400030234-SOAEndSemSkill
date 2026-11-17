package com.klu.bank.controller;

import org.springframework.web.bind.annotation.*;
import com.klu.bank.entity.Bank;
import com.klu.bank.service.BankService;

@RestController
@RequestMapping("/bank")
public class BankController {

    private final BankService service;

    public BankController(BankService service) {
        this.service = service;
    }

    // First API: Save credentials
    @PostMapping("/login")
    public String login(@RequestBody Bank bank) {
        return service.login(bank);
    }

    // Second API: Check credentials
    @PostMapping("/checkLogin")
    public String checkLogin(@RequestBody Bank bank) {
        return service.checkLogin(
                bank.getUsername(),
                bank.getPassword()
        );
    }
}