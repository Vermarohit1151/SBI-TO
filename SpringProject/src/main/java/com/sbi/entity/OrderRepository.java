package com.sbi.entity;

import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository {
	public void processOrder(Order orderObj);
	
}
