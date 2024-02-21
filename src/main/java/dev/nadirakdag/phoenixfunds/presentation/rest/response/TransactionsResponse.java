package dev.nadirakdag.phoenixfunds.presentation.rest.response;

import java.util.List;

public record TransactionsResponse (List<TransactionResponse> transactions) {
}
