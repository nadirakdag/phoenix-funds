package dev.nadirakdag.phoenixfunds.presentation.rest;

import dev.nadirakdag.phoenixfunds.presentation.rest.request.DepositRequest;
import dev.nadirakdag.phoenixfunds.presentation.rest.response.TransactionResponse;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;

class DepositControllerTest extends BaseIntegrationTest {

    @Test
    void createWithdrawTest() {

        HttpEntity<DepositRequest> entity = new HttpEntity<>(new DepositRequest(UUID.randomUUID().toString(), 100.00), headers);

        //when
        ResponseEntity<TransactionResponse> response = restTemplate.exchange(
                createURLWithPort("/v1/accounts/"+ UUID.randomUUID() + "/deposit"),
                HttpMethod.POST,
                entity,
                TransactionResponse.class);

        //assert
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.CREATED);
    }
}
