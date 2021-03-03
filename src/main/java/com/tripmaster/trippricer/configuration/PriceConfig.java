package com.tripmaster.trippricer.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import tripPricer.TripPricer;

@Configuration
public class PriceConfig {
	@Bean
	public TripPricer getTripPricer() {
		return new TripPricer();
	}
}