package dev.nadirakdag.phoenixfunds.presentation.rest;

import dev.nadirakdag.phoenixfunds.presentation.rest.response.TransactionResponse;
import dev.nadirakdag.phoenixfunds.presentation.rest.response.TransactionsResponse;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;

class HistoryControllerTest extends BaseIntegrationTest{

    @Test
    void getAllHistoryTest() {

        //when
        ResponseEntity<TransactionsResponse> response = restTemplate.getForEntity(createURLWithPort("/v1/accounts/" + UUID.randomUUID() + "/history"), TransactionsResponse.class);

        //assert
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
    }

    @Test
    void getHistoryTest() {

        //when
        ResponseEntity<TransactionResponse> response = restTemplate.getForEntity(createURLWithPort("/v1/accounts/" + UUID.randomUUID() + "/history/" + UUID.randomUUID() ), TransactionResponse.class);

        //assert
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
    }
}
