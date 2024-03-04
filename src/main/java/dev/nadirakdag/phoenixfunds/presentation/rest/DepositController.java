package dev.nadirakdag.phoenixfunds.presentation.rest;

import dev.nadirakdag.phoenixfunds.domain.services.TransactionService;
import dev.nadirakdag.phoenixfunds.presentation.rest.request.DepositRequest;
import dev.nadirakdag.phoenixfunds.presentation.rest.response.TransactionResponse;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.time.Instant;
import java.util.UUID;

@RestController
@RequestMapping("/v1/accounts/{account-uid}/deposit")
@Slf4j
@AllArgsConstructor
public class DepositController {

    private final TransactionService transactionService;

    @PostMapping
    public ResponseEntity<TransactionResponse> deposit(@PathVariable("account-uid")UUID accountUid, @RequestBody DepositRequest request){
        log.info("account deposit requested, account uuid: {}", accountUid);

        TransactionResponse transactionResponse = TransactionResponse.builder()
                .transactionUid(UUID.randomUUID().toString())
                .transactionDate(Instant.now())
                .transactionType("DEPOSIT")
                .amount(request.amount())
                .accountUid(accountUid.toString())
                .build();

        return ResponseEntity.created(URI.create("/v1/accounts/"+UUID.randomUUID()+ "/history/" + UUID.randomUUID())).body(transactionResponse);
    }
}
