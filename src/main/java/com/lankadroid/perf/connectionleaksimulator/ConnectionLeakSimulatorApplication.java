package com.lankadroid.perf.connectionleaksimulator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConnectionLeakSimulatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConnectionLeakSimulatorApplication.class, args);
	}

}
