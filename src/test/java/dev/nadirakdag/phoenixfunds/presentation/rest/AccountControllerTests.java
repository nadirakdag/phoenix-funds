package dev.nadirakdag.phoenixfunds.presentation.rest;

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
        ResponseEntity<?> response = restTemplate.getForEntity(createURLWithPort("/v1/accounts/" + UUID.randomUUID()), ResponseEntity.class);

        //assert
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
    }

    @Test
    void createAccountTest() {

        headers.add("Content-Type", "application/json;charset=UTF-8");
        HttpEntity<String> entity = new HttpEntity<>("{}", headers);


        //when
        ResponseEntity<?> response = restTemplate.exchange(
                createURLWithPort("/v1/accounts"),
                HttpMethod.POST,
                entity,
                String.class);

        //assert
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.CREATED);
    }
}
