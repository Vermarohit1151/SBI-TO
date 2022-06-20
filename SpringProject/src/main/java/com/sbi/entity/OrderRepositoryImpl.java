package com.sbi.entity;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class OrderRepositoryImpl extends AbstractJpaRepository implements OrderRepository {

	@Transactional
	public void processOrder(Order orderObj) {
		getEntityManager().persist(orderObj);
		
	}

}
