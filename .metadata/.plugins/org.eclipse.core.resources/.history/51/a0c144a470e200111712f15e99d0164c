package com.klu.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.klu.bank.entity.Bank;

public interface BankRepository extends JpaRepository<Bank, Integer> {

    boolean existsByUsernameAndPassword(String username, String password);
}