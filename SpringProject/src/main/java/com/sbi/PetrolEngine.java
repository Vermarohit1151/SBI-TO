package com.sbi;

public class PetrolEngine extends Engine {

//	public PetrolEngine(Piston piston) {
//		super(piston);
//		System.out.println("PetrolEngine(Piston) constructor....");
//	}
	public void setPiston(Piston piston) {
		super.setPiston(piston);
		System.out.println("PetrolEngine: setPiston(Piston) property....");
		System.out.println("------------------");
	}
}
