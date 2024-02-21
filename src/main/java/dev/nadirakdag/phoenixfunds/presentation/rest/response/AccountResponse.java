package dev.nadirakdag.phoenixfunds.presentation.rest.response;

import lombok.Builder;

import java.time.Instant;

@Builder
public record AccountResponse(String id, String currencyType, Instant createdDate, double balance) {
}
