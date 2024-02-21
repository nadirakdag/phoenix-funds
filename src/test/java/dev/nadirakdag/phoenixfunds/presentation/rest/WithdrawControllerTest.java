package dev.nadirakdag.phoenixfunds.presentation.rest;

import dev.nadirakdag.phoenixfunds.presentation.rest.request.WithdrawRequest;
import dev.nadirakdag.phoenixfunds.presentation.rest.response.TransactionResponse;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;

    class WithdrawControllerTest extends BaseIntegrationTest {
    @Test
    void createWithdrawTest() {

        HttpEntity<WithdrawRequest> entity = new HttpEntity<>(new WithdrawRequest(UUID.randomUUID().toString(), 100.00), headers);

        //when
        ResponseEntity<TransactionResponse> response = restTemplate.exchange(
                createURLWithPort("/v1/accounts/"+ UUID.randomUUID() + "/withdraw"),
                HttpMethod.POST,
                entity,
                TransactionResponse.class);

        //assert
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.CREATED);
    }
}
