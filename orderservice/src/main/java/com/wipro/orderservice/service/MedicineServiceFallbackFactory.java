package com.wipro.orderservice.service;

import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.stereotype.Component;

import com.wipro.orderservice.model.Medicine;


@Component
public class MedicineServiceFallbackFactory implements FallbackFactory<MedicineServiceConsumer> {

	@Override
	public MedicineServiceConsumer create(Throwable cause) {
		return new MedicineServiceConsumer() {

			@Override
			public Medicine getMedicineById(int medicineId) {

				return new Medicine();
			}

			@Override
			public String getMedicineData() {
				return null;
			}
		};
	}
}
