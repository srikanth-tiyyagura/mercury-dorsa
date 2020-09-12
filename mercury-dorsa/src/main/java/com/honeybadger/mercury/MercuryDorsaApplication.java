package com.honeybadger.mercury;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import com.honeybadger.mercury.configuration.ElectionConfiguration;

@SpringBootApplication
@EntityScan()
public class MercuryDorsaApplication extends ElectionConfiguration{

	// 
	public static void main(String[] args) {
		SpringApplication.run(MercuryDorsaApplication.class, args);
	}

}
