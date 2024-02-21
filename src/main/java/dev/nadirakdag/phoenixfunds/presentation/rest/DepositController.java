package dev.nadirakdag.phoenixfunds.presentation.rest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.util.UUID;

@RestController
@RequestMapping("/v1/accounts/{account-uid}/deposit")
@Slf4j
public class DepositController {

    @PostMapping
    public ResponseEntity<?> deposit(@PathVariable("account-uid") UUID accountUid){
        log.info("account deposit requested, account uuid: {}", accountUid);
        return ResponseEntity.created(URI.create("/v1/accounts/"+UUID.randomUUID()+ "/history/" + UUID.randomUUID())).body(null);
    }
}
