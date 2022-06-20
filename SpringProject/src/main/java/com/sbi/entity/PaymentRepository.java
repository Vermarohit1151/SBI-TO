package com.sbi.entity;

import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository {
	public void processPayment(Payment paymentObj);
}
