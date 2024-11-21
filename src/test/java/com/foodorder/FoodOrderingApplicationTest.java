package com.foodorder;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class FoodOrderingApplicationTest {

	@Autowired
	private RestTemplate restTemplate;

	// Test if the application context loads correctly
	@Test
	void contextLoads() {
		assertThat(restTemplate).isNotNull(); // Verifies that the RestTemplate bean is loaded
	}

	// Test to check if the /api/orders/all endpoint is accessible and returns a valid response
	@Test
	void testGetAllOrders() {
		String baseUrl = "http://localhost:8081/api/orders/all";
		ResponseEntity<String> response = restTemplate.getForEntity(baseUrl, String.class);

		// Assert that the response status is 200 OK
		assertThat(response.getStatusCodeValue()).isEqualTo(200);

		// Assert that the response body is not null
		assertThat(response.getBody()).isNotNull();

		// Optionally, check the response contains expected data
		assertThat(response.getBody()).contains("orderId");
	}

	// Test to check if the /api/orders/place endpoint handles POST requests
	@Test
	void testPlaceOrder() {
		String baseUrl = "http://localhost:8081/api/orders/place";

		// Sample order data
		String orderJson = "{"
				+ "\"customerName\": \"Test User\","
				+ "\"foodItem\": \"Pizza\","
				+ "\"quantity\": 2"
				+ "}";

		ResponseEntity<String> response = restTemplate.postForEntity(baseUrl, orderJson, String.class);

		// Assert that the response status is 200 OK
		assertThat(response.getStatusCodeValue()).isEqualTo(200);

		// Assert that the response contains the expected order data
		assertThat(response.getBody()).contains("orderId", "Test User", "Pizza");
	}
}