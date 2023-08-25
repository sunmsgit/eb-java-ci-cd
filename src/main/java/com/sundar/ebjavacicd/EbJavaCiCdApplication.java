package com.sundar.ebjavacicd;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class EbJavaCiCdApplication {

	public static void main(String[] args) {
		SpringApplication.run(EbJavaCiCdApplication.class, args);
	}

}

@RestController
class VersionController {

	@Value("${version}")
	private String version;

	@GetMapping("/version")
	public String getVersion() {
		return version;
	}

	@GetMapping("/")
	public String health() {
		return "Service is fine.";
	}
}
