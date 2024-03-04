package dev.nadirakdag.phoenixfunds.domain.entities;

import lombok.Builder;
import lombok.Getter;

import java.time.Instant;
import java.util.UUID;

@Getter
@Builder
public class Account {

    private UUID id;
    private UUID userUid;

    private Instant createdAt;
    private AccountCurrency accountCurrency;

    private double balance;
}
