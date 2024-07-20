package com.sonny.accounts;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class AccountService {

    private AccountRepository accountRepository;

    public void createAccount(Account account) {
        this.accountRepository.save(account);
    }

    public List<Account> search() {
        return this.accountRepository.findAll();
    }

}
