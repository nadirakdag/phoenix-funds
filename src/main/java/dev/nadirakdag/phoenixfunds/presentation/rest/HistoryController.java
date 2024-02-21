package dev.nadirakdag.phoenixfunds.presentation.rest;

import dev.nadirakdag.phoenixfunds.presentation.rest.response.TransactionResponse;
import dev.nadirakdag.phoenixfunds.presentation.rest.response.TransactionsResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/v1/accounts/{account-uid}/history")
@Slf4j
public class HistoryController {

    @GetMapping
    public ResponseEntity<TransactionsResponse> getAllHistory(@PathVariable("account-uid")UUID accountUid) {
        log.info("account history requested, account uuid: {}", accountUid);

        TransactionResponse transactionResponse = TransactionResponse.builder()
                .transactionUid(UUID.randomUUID().toString())
                .transactionDate(Instant.now())
                .transactionType("WITHDRAW")
                .amount(100.00)
                .accountUid(accountUid.toString())
                .build();

        TransactionsResponse transactionsResponse = new TransactionsResponse(List.of(transactionResponse));

        return ResponseEntity.ok(transactionsResponse);
    }


    @GetMapping("/{transaction-uid}")
    public ResponseEntity<TransactionResponse> getAllHistory(@PathVariable("account-uid")UUID accountUid, @PathVariable("transaction-uid") UUID transactionUid) {
        log.info("account specific history record requested, account uuid: {}, transaction uuid: {}", accountUid, transactionUid);

        TransactionResponse transactionResponse = TransactionResponse.builder()
                .transactionUid(UUID.randomUUID().toString())
                .transactionDate(Instant.now())
                .transactionType("WITHDRAW")
                .amount(100.00)
                .accountUid(accountUid.toString())
                .build();

        return ResponseEntity.ok(transactionResponse);
    }
}
