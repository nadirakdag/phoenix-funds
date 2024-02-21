package dev.nadirakdag.phoenixfunds.presentation.rest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/v1/accounts/{account-uid}/history")
@Slf4j
public class HistoryController {

    @GetMapping
    public ResponseEntity<?> getAllHistory(@PathVariable("account-uid")UUID accountUid) {
        log.info("account history requested, account uuid: {}", accountUid);
        return ResponseEntity.ok(null);
    }


    @GetMapping("/{transaction-uid}")
    public ResponseEntity<?> getAllHistory(@PathVariable("account-uid")UUID accountUid, @PathVariable("transaction-uid") UUID transactionUid) {
        log.info("account specific history record requested, account uuid: {}, transaction uuid: {}", accountUid, transactionUid);
        return ResponseEntity.ok(null);
    }
}
