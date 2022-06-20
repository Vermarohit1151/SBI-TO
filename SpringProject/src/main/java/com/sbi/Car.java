package com.sbi;
public class Car implements Vehicle { //isA
	
	Engine engine ;
	
//	public Car(Engine engine) {
//		System.out.println("Car(Engine) constructed..."+engine);
//		this.engine = engine;
//	}
	
	public void setEngine(Engine engine) {
		System.out.println("Car: setEngine(Engine) property..."+engine);
		this.engine = engine;
	}
	public void drive() {
		engine.ignite();
		System.out.println("Driving a Car...");
	}
}
