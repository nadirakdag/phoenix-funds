package dev.nadirakdag.phoenixfunds.presentation.rest;

import dev.nadirakdag.phoenixfunds.presentation.rest.request.WithdrawRequest;
import dev.nadirakdag.phoenixfunds.presentation.rest.response.TransactionResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.time.Instant;
import java.util.UUID;

@RestController
@RequestMapping("/v1/accounts/{account-uid}/withdraw")
@Slf4j
public class WithdrawController {

    @PostMapping
    public ResponseEntity<TransactionResponse> withdraw(@PathVariable("account-uid")UUID accountUid, @RequestBody WithdrawRequest request){
        log.info("account withdraw requested, account uuid: {}", accountUid);

        TransactionResponse transactionResponse = TransactionResponse.builder()
                .transactionUid(UUID.randomUUID().toString())
                .transactionDate(Instant.now())
                .transactionType("WITHDRAW")
                .amount(request.amount())
                .accountUid(accountUid.toString())
                .build();

        return ResponseEntity.created(URI.create("/v1/accounts/"+UUID.randomUUID()+ "/history/" + UUID.randomUUID())).body(transactionResponse);
    }
}
