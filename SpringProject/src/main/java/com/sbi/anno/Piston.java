package com.sbi.anno;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("thePiston")
public class Piston {
	
	@Value("Twin Spark")
	String pistonType;
	
//	public Piston(String pistonType) {
//		System.out.println("Piston(String) constructed...");
//		this.pistonType = pistonType;
//	}
	
	public void setPistonType(String pistonType) {
		System.out.println("Piston: setPistonType(String) property...");
		this.pistonType = pistonType;
	}
	
	void firePiston() {
		System.out.println("Firing the piston...."+pistonType);
	}
}
