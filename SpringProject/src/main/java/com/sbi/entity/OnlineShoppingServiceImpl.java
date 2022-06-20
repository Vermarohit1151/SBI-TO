package com.sbi.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OnlineShoppingServiceImpl implements OnlineShoppingService {
	
	
	private OrderRepository orderRepo;
	private PaymentRepository payRepo;
	private ProductRepository prodRepo;
	
	@Autowired
	public void init(OrderRepository o, PaymentRepository p, ProductRepository pro) {
		this.orderRepo = o;
		this.payRepo = p;
		this.prodRepo = pro;
	}
	
	
	@Transactional
	public void placeOrder(Order order) {
		
		System.out.println("generating Order...");
		orderRepo.processOrder(order);
		System.out.println("Order generated...");
		System.out.println("----------------------------------");
		System.out.println("Generating Payment details.....");
		Payment paymentObj = new Payment();
		paymentObj.setOrderId(order.getOrderId());
		paymentObj.setAmount(order.getQuantity()*order.getPrice());
		
		payRepo.processPayment(paymentObj);
		System.out.println("-----------------------------------");
		System.out.println("Updating the inventory.....");
		prodRepo.reduceStock(order.getProductId(), order.getQuantity());
		System.out.println("stock reduced successfully");
		
	}

}
