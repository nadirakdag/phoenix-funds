package dev.nadirakdag.phoenixfunds.presentation.rest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.UUID;

@RestController
@RequestMapping("/v1/accounts")
@Slf4j
public class AccountController {

    @GetMapping("/{account-uid}")
    public ResponseEntity<?> getAccount(@PathVariable("account-uid") UUID accountUid){
        log.info("account requested, account uuid: {}", accountUid);
        return ResponseEntity.ok(null);
    }

    @PostMapping
    public ResponseEntity<?> createAccount() {
        log.info("account create requested");
        return ResponseEntity.created(URI.create("/v1/accounts/"+UUID.randomUUID())).body(null);
    }
}
