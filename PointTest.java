
public class PointTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Point3D P1 = new Point3D(10, 20, 30);
//		System.out.println("P1: "+P1);
//		
//		
//		ColouredPoint3D cp3 = new ColouredPoint3D(3, 4, 5, "Cyan");
//		System.out.println("Colored Point in 3D: " +cp3);
//		
//		ColouredPoint2D cp2 = new ColouredPoint2D(10,20, "Red");
//		System.out.println("Colored Point in 2D: " +cp2);
		
		
//		GrandFather gf = new GrandFather();
//		Father f = new Father();
//		Child c = new Child();
		
		
	}

}

class Point2D{ 					// 2D Point Blueprint
	private int x;
	private int y;
	public Point2D(int x, int y) {
		super();
		this.x = x;				// This() used to invoke same class constructor
		this.y = y;				// This. used to invoke method/data of same class
	}
	
	@Override
	public String toString() {
		return "[x=" + x + ", y=" + y + "";
	}

}

class Point3D extends Point2D{				// 3D Point Blueprint
	
	private int z;
	public Point3D(int x, int y,int z) {
		super(x,y);							//super() used to invoke constructor of nearest parent class
		
		this.z = z;
	}
	@Override
	public String toString() {	
		return  super.toString() 			//super. used to access any parent method or data member
				+ ", z=" + z + "";
	}
	
	

}

class ColouredPoint2D extends Point2D{					// Child class of point2D with added color feature
	private String color;
	
	public ColouredPoint2D(int x, int y, String color){
		super(x,y);
		this.color = color;
	}

	@Override
	public String toString() {
		return super.toString()+" ,color=" + color + "]";
	}
	
}

class ColouredPoint3D extends Point3D{ 					// Child class of point3D with added color feature
	private String color;
	
	public ColouredPoint3D(int x, int y, int z, String color) {
		super(x,y,z);
		this.color = color;
		
	}

	@Override
	public String toString() {
		return super.toString()+" ,color=" + color + "]";
		
	}
	
}

class GrandFather{								// Class GrandFather
	public GrandFather() {
		System.out.println("Blank Ctor");
	}
	public GrandFather(int p) {
		System.out.println("GrandFather ...."+p);
	}
}
class Father extends GrandFather{				// Class Father as subclass inherited from GrandFather
	public Father() {
		super(70);
		System.out.println("\tFather ....");
	}
}
class Child extends Father{						// Class Child as subclass inherited from Father
	public Child() {
		System.out.println("\t\tChild ....");
	}
}

