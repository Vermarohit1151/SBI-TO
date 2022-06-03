import java.time.LocalDate;
public class JuiceMakerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit newFruit ;
		
		newFruit = new Mango("");
		Ingredients ingredients = new Ingredients(0.5f,10,1.2f);
		JuiceMaker jMaker = new JuiceMaker();
		jMaker.makeJuice(newFruit, ingredients);
	}

}

abstract class machine{
	int serialNumber;
	LocalDate mfgDate;
	String countryOfOrigin;

}

class Jar {
	int capacity;
	int noOfblades;
	String material;

	public Jar(int capacity, int noOfblades, String material) {
		super();
		this.capacity = capacity;
		this.noOfblades = noOfblades;
		this.material = material;
	}
}

abstract class Juice{
	abstract void taste();
	//System.out.println(fruitObj.fruitName+" Juice is ready to consume...");
	abstract void Juice(Fruit f);
}

class MangoJuice extends Juice{

	@Override
	void taste() {
		System.out.println("Its a Sweet juice...");

	}

	@Override
	void Juice(Fruit f) {
		System.out.println("Your "+f.fruitName+" Juice is ready to consume");

	}

}	
class OrangeJuice extends Juice{

	@Override
	void taste() {
		System.out.println("Its a Sour juice...");

	}

	@Override
	void Juice(Fruit f) {
		System.out.println("Your "+f.fruitName+" Juice is ready to consume");

	}

}






abstract class Fruit{
	String fruitName;
	int Qty;
}



class Orange extends Fruit{
 public Orange(String f) {
	 System.out.println("A new Fruit Object ORANGE is created");
 }
}

class Mango extends Fruit{
	
	public Mango(Fruit f){
		 System.out.println("A new Fruit Object MANGO is created");
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

interface Mixer{
	void mixing();
}

interface Grinder{
	void grinding();
}

class JuiceMaker extends machine implements Mixer,Grinder
{   				 //Is-A relationship

	String brand;
	String material;
	String type;
	int power;
	int Price;


	Jar juiceJar = new Jar(1,3,"ABS Plastic");   	  //Has-A relationship

	
	public Juice makeJuice(Fruit Mango,Ingredients ingredients) {    //Uses-A
		Juice j = new MangoJuice();
		j.taste();
		j.Juice(Mango);
		JuiceMaker jj = new JuiceMaker();
		jj.grinding();
		jj.mixing();
		return j;												 //Produces-A
	}


	@Override
	public void grinding() {
		System.out.println("Grinding the fruits...");

	}


	@Override
	public void mixing() {
		System.out.println("Mixing the fruit juice...");

	}
}