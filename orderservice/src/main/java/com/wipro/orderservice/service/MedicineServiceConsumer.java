package com.wipro.orderservice.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.wipro.orderservice.model.Medicine;

@FeignClient(name = "MEDICINE", fallbackFactory = MedicineServiceFallbackFactory.class)
public interface MedicineServiceConsumer {

	@GetMapping("/medicine/{id}")
	Medicine getMedicineById(@PathVariable("id") int medieId);

	@GetMapping("/medicine/data")
	String getMedicineData();
}