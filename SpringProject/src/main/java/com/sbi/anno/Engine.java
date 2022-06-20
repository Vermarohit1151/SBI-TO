package com.sbi.anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("theEngine")
public class Engine {
	
	@Autowired
	Piston piston ;
	
//	public Engine(Piston piston) {
//		System.out.println("Engine(Piston) constructed...");
//		this.piston = piston;
//	}
	public void setPiston(Piston piston) {
		System.out.println("Engine: setPiston(Piston) property...");
		this.piston = piston;
	}
	
	void ignite() {
		piston.firePiston();
		System.out.println("Engine is ignited...");
	}
}
