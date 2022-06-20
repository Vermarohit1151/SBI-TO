package com.sbi.entity;
import javax.persistence.*;

@Entity
@Table(name="tx_orders")
public class Order {
	
	@Id
	@GeneratedValue
	private int orderId;
	private int productId;
	private int quantity;
	private double price;
	
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double d) {
		this.price = d;
	}
	
	
}
