package dev.nadirakdag.phoenixfunds.application.services;

import dev.nadirakdag.phoenixfunds.domain.entities.Account;
import dev.nadirakdag.phoenixfunds.domain.repositories.AccountRepository;
import dev.nadirakdag.phoenixfunds.domain.services.AccountService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@AllArgsConstructor
public class AccountImpService implements AccountService {

    private final AccountRepository accountRepository;

    @Override
    public Account getAccount(UUID accountUid) {
        return accountRepository.getAccount(accountUid);
    }

    @Override
    public Account createAccount(Account account) {
        return accountRepository.createAccount(account);
    }
}
