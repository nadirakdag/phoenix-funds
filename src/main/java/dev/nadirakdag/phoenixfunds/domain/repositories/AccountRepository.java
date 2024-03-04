package dev.nadirakdag.phoenixfunds.domain.repositories;

import dev.nadirakdag.phoenixfunds.domain.entities.Account;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface AccountRepository {

    Account getAccount(UUID accountUid);
    Account createAccount(Account account);

}
