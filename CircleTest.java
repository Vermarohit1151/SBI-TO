
public class CircleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle1 c1 = new Circle1(12.54);
		c1.calculateArea();
	}

}

 class Circle1{
	 final double pi = 3.14;
	 double radius;
	 
	 Circle1(double radius)
	 {
		 this.radius = radius;
	 }
	 
	 void calculateArea() {
		 double area = pi * radius * radius;
		 System.out.println("AREA = "+area);
	 }
	 void calculatePerimeter() {
		 double perimeter = 2 * pi * radius;
		 System.out.println("Perimeter ="+perimeter);
	 }
 }