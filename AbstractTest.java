
public class AbstractTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		gs = new Circle2(5);
//		gs = new Square(4);
//		
//		gs.calculateArea();
//		gs.calculatePerimeter();
//		System.out.println("--------------------");
//		gs.calculateArea();
//		gs.calculatePerimeter();
		
		
		GeometricalShape gs;
//		gs = new Rectangle(20,10);
//		gs.calculateArea();
//		gs.calculatePerimeter();
		
		gs = new Square(20);
		gs.calculateArea();
		gs.calculatePerimeter();
	}

}

abstract class GeometricalShape
{
	final double pi = 3.14;
	abstract void draw();
	abstract void calculateArea();
		
	abstract void calculatePerimeter();
}

class Circle2 extends GeometricalShape{
	double radius;
	
	public Circle2(double r) {
		super();
		this.radius = r;
	}

	@Override
	void draw() {
		System.out.println("Circle is drawn...");
	}

	@Override
	void calculateArea() {
		System.out.println("AREA ="+pi*radius*radius);
		
	}

	@Override
	void calculatePerimeter() {
		System.out.println("PERIMETER ="+pi*2*radius);
	}
	
}

class Square extends Rectangle{

	
	
	public Square(int side) {
		super(side,side);
		
	}
	
	@Override
	void calculatePerimeter() {
		System.out.println("AREA ="+4*side);
	}
	
	
}

class Rectangle extends GeometricalShape{
	int side;
	int side2;
	Rectangle(int side1,int side2){
		this.side = side1;
		this.side2 = side2;
	}
	
	
	@Override
	void draw() {
		System.out.println("System is drawing rectangle");
	}
	@Override
	void calculateArea() {
		System.out.println("AREA ="+side*side2);
	}
	
	@Override
	void calculatePerimeter() {
		System.out.println("PERIMETER ="+2*(side+side2));
		
	}
}