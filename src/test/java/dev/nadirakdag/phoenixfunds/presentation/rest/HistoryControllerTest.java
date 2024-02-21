package dev.nadirakdag.phoenixfunds.presentation.rest;

import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;

class HistoryControllerTest extends BaseIntegrationTest{

    @Test
    void getAllHistoryTest() {

        //when
        ResponseEntity<?> response = restTemplate.getForEntity(createURLWithPort("/v1/accounts/" + UUID.randomUUID() + "/history"), ResponseEntity.class);

        //assert
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
    }

    @Test
    void getHistoryTest() {

        //when
        ResponseEntity<?> response = restTemplate.getForEntity(createURLWithPort("/v1/accounts/" + UUID.randomUUID() + "/history/" + UUID.randomUUID() ), ResponseEntity.class);

        //assert
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
    }
}
