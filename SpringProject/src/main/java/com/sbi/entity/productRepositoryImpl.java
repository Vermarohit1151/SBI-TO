package com.sbi.entity;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class productRepositoryImpl implements ProductRepository {
	
	@Autowired
	public JdbcTemplate jdbcTemplate;

	@Transactional
	public void reduceStock(int productId, int quantity) {
		String query = "Update Tx_Products set quantity = quantity - ? where productid=?";
		
		System.out.println("Bad way to log SQL "+query);
		
		jdbcTemplate.update(query,quantity,productId);
		
	}

}
