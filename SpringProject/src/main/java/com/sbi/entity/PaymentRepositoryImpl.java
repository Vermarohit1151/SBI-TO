package com.sbi.entity;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class PaymentRepositoryImpl extends AbstractJpaRepository implements PaymentRepository {

	@Transactional
	public void processPayment(Payment paymentObj) {
		getEntityManager().persist(paymentObj);

	}

}
