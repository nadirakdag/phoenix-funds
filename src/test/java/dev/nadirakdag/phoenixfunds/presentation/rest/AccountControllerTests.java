package dev.nadirakdag.phoenixfunds.presentation.rest;

import dev.nadirakdag.phoenixfunds.presentation.rest.response.AccountResponse;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;


class AccountControllerTests extends BaseIntegrationTest {

    @Test
    void getAccountTest() {

        //when
        ResponseEntity<AccountResponse> response = restTemplate.getForEntity(createURLWithPort("/v1/accounts/" + UUID.randomUUID()), AccountResponse.class);

        //assert
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
    }

    @Test
    void createAccountTest() {

        headers.add("Content-Type", "application/json;charset=UTF-8");
        HttpEntity<String> entity = new HttpEntity<>("{}", headers);


        //when
        ResponseEntity<AccountResponse> response = restTemplate.exchange(
                createURLWithPort("/v1/accounts"),
                HttpMethod.POST,
                entity,
                AccountResponse.class);

        //assert
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.CREATED);
    }
}
