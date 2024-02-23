package dev.nadirakdag.phoenixfunds.domain.entities;

import lombok.*;

import java.time.Instant;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Transaction {

    private String id;
    private String accountUid;
    private String userUid;

    private Instant createdAt;

    private double amount;
    private TransactionType type;
}

