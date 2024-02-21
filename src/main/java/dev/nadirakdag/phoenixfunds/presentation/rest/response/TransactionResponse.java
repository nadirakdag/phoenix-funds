package dev.nadirakdag.phoenixfunds.presentation.rest.response;

import lombok.Builder;

import java.time.Instant;

@Builder
public record TransactionResponse (String transactionUid, String accountUid, String transactionType, double amount, Instant transactionDate)  {
}
