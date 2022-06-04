
public class GenericTest {
	public static void main(String[] args) {
		Egg eggArray[] = new Egg[12];
		 eggArray[0] = new Egg("Hen", "White", 7.00f, 50.0f);
		 eggArray[1] = new Egg("Hen", "White", 6.00f, 52.0f);
		 eggArray[2] = new Egg("Hen", "White", 7.00f, 50.0f);
		 eggArray[3] = new Egg("Hen", "White", 7.00f, 50.0f);
		 eggArray[4] = new Egg("Hen", "White", 6.00f, 51.0f);
		 eggArray[5] = new Egg("Hen", "White", 7.00f, 50.0f);
		 
		 eggArray[6] = new Egg("Hen", "White", 5.50f, 50.0f);
		 eggArray[7] = new Egg("Hen", "White", 7.00f, 54.0f);
		 eggArray[8] = new Egg("Hen", "White", 6.00f, 50.0f);
		 eggArray[9] = new Egg("Hen", "White", 7.00f, 50.0f);
		 eggArray[10] = new Egg("Hen", "White", 7.00f, 50.0f);
		 eggArray[11] = new Egg("Hen", "White", 4.00f, 45.0f);
	
		 for(int i=0; i<eggArray.length; i++) {
			System.out.println(+i+"] "+eggArray[i]);
		 }
		 
	}
}

class Egg 
{
	String type;
	String color;
	float cost;
	float weight;
	public Egg(String type, String color, float cost, float weight) {
		super();
		this.type = type;
		this.color = color;
		this.cost = cost;
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "egg [type=" + type + ", color=" + color + ", cost=" + cost + ", weight=" + weight + "]";
	}
	
	
}