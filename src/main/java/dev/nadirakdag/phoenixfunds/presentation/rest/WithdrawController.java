package dev.nadirakdag.phoenixfunds.presentation.rest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.UUID;

@RestController
@RequestMapping("/v1/accounts/{account-uid}/withdraw")
@Slf4j
public class WithdrawController {

    @PostMapping
    public ResponseEntity<?> withdraw(@PathVariable("account-uid")UUID accountUid){
        log.info("account withdraw requested, account uuid: {}", accountUid);
        return ResponseEntity.created(URI.create("/v1/accounts/"+UUID.randomUUID()+ "/history/" + UUID.randomUUID())).body(null);
    }
}
