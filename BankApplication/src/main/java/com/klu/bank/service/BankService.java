package com.klu.bank.service;

import org.springframework.stereotype.Service;
import com.klu.bank.entity.Bank;
import com.klu.bank.repository.BankRepository;

@Service
public class BankService {

    private final BankRepository repo;

    public BankService(BankRepository repo) {
        this.repo = repo;
    }

    // First method: Save credentials in database
    public String login(Bank bank) {

        repo.save(bank);

        return "Credentials saved successfully";
    }

    // Second method: Verify credentials from database
    public String checkLogin(String username, String password) {

        boolean result =
                repo.existsByUsernameAndPassword(username, password);

        if (result) {
            return "Login Successful";
        } else {
            return "Invalid Username or Password";
        }
    }
}