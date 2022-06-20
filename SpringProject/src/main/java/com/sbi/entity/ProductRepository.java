package com.sbi.entity;

import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository {
	
	public void reduceStock(int productId, int quantity);
		
	
}
