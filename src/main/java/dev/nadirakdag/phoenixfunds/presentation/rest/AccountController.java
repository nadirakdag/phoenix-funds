package dev.nadirakdag.phoenixfunds.presentation.rest;

import dev.nadirakdag.phoenixfunds.domain.entities.Account;
import dev.nadirakdag.phoenixfunds.domain.services.AccountService;
import dev.nadirakdag.phoenixfunds.presentation.rest.request.AccountRequest;
import dev.nadirakdag.phoenixfunds.presentation.rest.response.AccountResponse;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.UUID;

@RestController
@RequestMapping("/v1/accounts")
@Slf4j
@AllArgsConstructor
public class AccountController {

    private final AccountService accountService;

    @GetMapping("/{account-uid}")
    public ResponseEntity<AccountResponse> getAccount(@PathVariable("account-uid") UUID accountUid){
        log.info("account requested, account uuid: {}", accountUid);

        Account account = accountService.getAccount(accountUid);
        AccountResponse accountResponse = AccountResponse.from(account);

        return ResponseEntity.ok(accountResponse);
    }

    @PostMapping
    public ResponseEntity<AccountResponse> createAccount(@RequestBody AccountRequest request) {
        log.info("account create requested");

        UUID accountUid = UUID.randomUUID();
        Account account = request.toAccount(accountUid);

        account = accountService.createAccount(account);
        AccountResponse accountResponse = AccountResponse.from(account);

        return ResponseEntity.created(URI.create("/v1/accounts/"+ accountResponse.id())).body(accountResponse);
    }
}
