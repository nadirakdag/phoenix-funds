package dev.nadirakdag.phoenixfunds.domain.entities;

import java.time.Instant;
import java.util.UUID;

public class Account {

    private UUID id;
    private UUID userUid;

    private Instant createdAt;
    private AccountCurrency accountCurrency;

    private double balance;
}
