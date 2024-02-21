package dev.nadirakdag.phoenixfunds.presentation.rest;

import dev.nadirakdag.phoenixfunds.presentation.rest.request.AccountRequest;
import dev.nadirakdag.phoenixfunds.presentation.rest.response.AccountResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.time.Instant;
import java.util.UUID;

@RestController
@RequestMapping("/v1/accounts")
@Slf4j
public class AccountController {

    @GetMapping("/{account-uid}")
    public ResponseEntity<AccountResponse> getAccount(@PathVariable("account-uid") UUID accountUid){
        log.info("account requested, account uuid: {}", accountUid);

        AccountResponse accountResponse = AccountResponse.builder()
                .id(accountUid.toString())
                .createdDate(Instant.now())
                .currencyType("TRY")
                .balance(100.00)
                .build();

        return ResponseEntity.ok(accountResponse);
    }

    @PostMapping
    public ResponseEntity<AccountResponse> createAccount(@RequestBody AccountRequest request) {
        log.info("account create requested");

        UUID accountUid = UUID.randomUUID();
        AccountResponse accountResponse = AccountResponse.builder()
                .id(accountUid.toString())
                .createdDate(Instant.now())
                .currencyType(request.currencyType())
                .balance(100.00)
                .build();

        return ResponseEntity.created(URI.create("/v1/accounts/"+ accountResponse.id())).body(accountResponse);
    }
}
