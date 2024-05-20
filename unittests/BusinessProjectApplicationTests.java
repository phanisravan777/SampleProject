package com.business;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class BusinessProjectApplicationTests {

	@LocalServerPort
	private int port;

	@Test
	void contextLoads() {
		assertTrue(true);
	}

	@Test
	void testApplicationStarts() {
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> response = restTemplate.getForEntity("http://localhost:" + port + "/", String.class);
		assertEquals(200, response.getStatusCodeValue());
	}

	@Test
	void testApplicationFails() {
		RestTemplate restTemplate = new RestTemplate();
		Exception exception = assertThrows(RuntimeException.class, () -> {
			restTemplate.getForEntity("http://localhost:" + port + "/fail", String.class);
		});
		String expectedMessage = "500 Internal Server Error";
		String actualMessage = exception.getMessage();
		assertTrue(actualMessage.contains(expectedMessage));
	}
}