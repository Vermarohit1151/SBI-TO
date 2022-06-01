import java.time.LocalDate;
public class JuiceMakerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruits fruit = new Fruits("Apple",4);
		Ingredients ingredients = new Ingredients(0.5f,10,1.2f);
		JuiceMaker jMaker = new JuiceMaker();
		
		jMaker.spinInJar(fruit, ingredients);
	}

}

class machine{
	int serialNumber;
	LocalDate mfgDate;
	String countryOfOrigin;
}

class Jar {
	 int capacity;
}

class Juice{
	Juice(Fruits frt)
	{
		System.out.println(frt.fruitName+" Juice is ready to consume...");
	}
}

class Fruits{
	String fruitName;
	int qty;
	
	public Fruits(String fruitName, int qty) {
		super();
		this.fruitName = fruitName;
		this.qty = qty;
	}
	
}

class Ingredients{
	float qtySugar;
	int qtyIceCubes;
	float qtyMilk;
	
	public Ingredients(float qtySugar, int qtyIceCubes, float qtyMilk) {
		super();
		this.qtySugar = qtySugar;
		this.qtyIceCubes = qtyIceCubes;
		this.qtyMilk = qtyMilk;
	}
	
}

class JuiceMaker extends machine{    //Is-A relationship
	String brand;
	String material;
	String type;
	int power;
	int Price;
	
	
	Jar juiceJar = new Jar();     //Has-A relationship
	
	
	public Juice spinInJar(Fruits fruit,Ingredients ingredients) {    //Uses-A
		Juice juice = new Juice(fruit);
		return juice;											//Produces-A
	}
}

 
