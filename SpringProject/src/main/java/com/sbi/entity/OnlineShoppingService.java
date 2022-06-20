package com.sbi.entity;

import org.springframework.stereotype.Service;

@Service
public interface OnlineShoppingService {
	
	public void placeOrder(Order order);
	
}
