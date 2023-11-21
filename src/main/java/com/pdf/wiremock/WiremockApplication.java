package com.pdf.wiremock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.contract.wiremock.AutoConfigureWireMock;

@SpringBootApplication
@AutoConfigureWireMock()
public class WiremockApplication {

	public static void main(String[] args) {
		SpringApplication.run(WiremockApplication.class, args);
	}

}
