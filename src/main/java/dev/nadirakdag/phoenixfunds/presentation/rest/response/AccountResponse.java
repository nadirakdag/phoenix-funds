package dev.nadirakdag.phoenixfunds.presentation.rest.response;

import dev.nadirakdag.phoenixfunds.domain.entities.Account;
import lombok.Builder;

import java.time.Instant;

@Builder
public record AccountResponse(String id, String currencyType, Instant createdDate, double balance) {

    public static AccountResponse from(Account account){
        return new AccountResponseBuilder()
                .id(account.getId().toString())
                .currencyType(account.getAccountCurrency().toString())
                .createdDate(account.getCreatedAt())
                .balance(account.getBalance())
                .build();
    }
}
