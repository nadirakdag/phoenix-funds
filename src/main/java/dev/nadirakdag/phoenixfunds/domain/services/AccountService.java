package dev.nadirakdag.phoenixfunds.domain.services;

import dev.nadirakdag.phoenixfunds.domain.entities.Account;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public interface AccountService {

    Account getAccount(UUID accountUid);
    Account createAccount(Account account);
}
