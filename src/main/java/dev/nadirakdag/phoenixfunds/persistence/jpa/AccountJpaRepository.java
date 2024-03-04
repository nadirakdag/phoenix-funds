package dev.nadirakdag.phoenixfunds.persistence.jpa;

import dev.nadirakdag.phoenixfunds.domain.entities.Account;
import dev.nadirakdag.phoenixfunds.domain.repositories.AccountRepository;

import java.util.UUID;

public class AccountJpaRepository implements AccountRepository {

    @Override
    public Account getAccount(UUID accountUid) {
        return null;
    }

    @Override
    public Account createAccount(Account account) {
        return null;
    }
}
