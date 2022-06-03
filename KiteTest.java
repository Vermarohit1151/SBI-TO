
public class KiteTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Kite.printKiteCount();
		
		Kite k1 = new Kite("Green",50,"Rohit");
		Kite k2 = new Kite("White",60,"Rahul");
		Kite k3 = new Kite("Black",70,"Ajay");
		
		System.out.println("k1 "+k1);
		System.out.println("k2 "+k2);
		System.out.println("k3 "+k3);
		
		Kite.printKiteCount();
		
		Kite.printKiteCount();
		k1.kiteFight(k2);
		
		Kite.printKiteCount();
		
		System.out.println("k1 "+k1);
		System.out.println("k2 "+k2);
		System.out.println("k3 "+k3);
		
		System.out.println("End of main..");
	}

}

class Kite{
	
	public static int kiteCount = 0;
	
	private String color;
	private int length;
	private String owner;
	private boolean flyingStatus;
	
	public Kite(String color, int length, String owner) {
		super();
		this.color = color;
		this.length = length;
		this.owner = owner;
		System.out.println("Kite is created");
		++kiteCount;
	}
	
	
	void kiteFight(Kite x) {
		System.out.println(color+" color kite initiated kite fight with "+x.color+" color kite");
		
		for(int i=1;i<=20;i++) {
			double v = Math.random()%10; // 0 to 1
			System.out.println(i+" v "+v);
			if(v > 0.98) {
				flyingStatus = false;
				kiteCount--;
				System.out.println(color+" kite is down...");
				break;
			}
			else if(v < 0.01) {
				x.flyingStatus = false;
				kiteCount--;
				System.out.println(x.color+" kite is down...");
				break;
			} 
			else if ( v >= 0.60 && v<=0.70) {
				flyingStatus = false;
				x.flyingStatus = false;
				System.out.println("Both kites are down...");
				kiteCount= kiteCount-2;
				break;
			}
		}
	}
	
	
	@Override
	public String toString() {
		return "Kite [color=" + color + ", length=" + length + ", owner=" + owner + ", flyingStatus=" + flyingStatus
				+ "]";
	}


	public static void printKiteCount() {
		System.out.println("There are "+kiteCount+" kite/s in the sky");
	}
	
}