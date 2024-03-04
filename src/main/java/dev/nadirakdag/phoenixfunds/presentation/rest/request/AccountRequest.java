package dev.nadirakdag.phoenixfunds.presentation.rest.request;

import dev.nadirakdag.phoenixfunds.domain.entities.Account;
import dev.nadirakdag.phoenixfunds.domain.entities.AccountCurrency;

import java.util.UUID;

public record AccountRequest (String currencyType) {

    public Account toAccount(UUID userId) {
        return Account.builder()
                .accountCurrency(AccountCurrency.valueOf(this.currencyType))
                .userUid(userId)
                .build();
    }
}
