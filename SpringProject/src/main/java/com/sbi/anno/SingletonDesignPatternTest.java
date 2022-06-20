package com.sbi.anno;

public class SingletonDesignPatternTest {
	public static void main(String[] args) {
		
		Kitchen kitchen1 = Kitchen.getKitchen();
		Kitchen kitchen2 = Kitchen.getKitchen();
		Kitchen kitchen3 = Kitchen.getKitchen();
		
		System.out.println("kitchen1 "+kitchen1);
		System.out.println("kitchen2 "+kitchen2);
		System.out.println("kitchen3 "+kitchen3);
	}
}
//gang of four 
class Kitchen
{
	private static Kitchen kitchenRef; // 1
	private Kitchen() {//2
		
	}
	public static  Kitchen getKitchen() {//3
		if(kitchenRef==null)
			kitchenRef = new Kitchen(); //allocate the object 
		
		return kitchenRef;
	}
}
