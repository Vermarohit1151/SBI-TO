package com.sbi;

public class DieselEngine extends Engine {

	/*public DieselEngine(Piston piston) {
		super(piston);
		System.out.println("DieselEngine(Piston) constructor....");

	}*/
	
	public void setPiston(Piston piston) {
		super.setPiston(piston);
		System.out.println("DieselEngine: setPiston(Piston) property....");
		System.out.println("------------------");
	}

}
