package dev.nadirakdag.phoenixfunds.presentation.rest;

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

        HttpEntity<String> entity = new HttpEntity<>(null, headers);

        //when
        ResponseEntity<?> response = restTemplate.exchange(
                createURLWithPort("/v1/accounts/"+ UUID.randomUUID() + "/deposit"),
                HttpMethod.POST,
                entity,
                String.class);

        //assert
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.CREATED);
    }
}
