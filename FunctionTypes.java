public class FunctionTypes{
	
	public static void main(String[] args) {
		DeveloperLife dev = new DeveloperLife();
		dev.wakeup();
		dev.code("Rohit");
		dev.takeABreak();
		dev.code("Rohit");
		dev.code("Rohit");
		dev.takeABreak();
		dev.code("Rohit");
		dev.test(8);
	}
}

class DeveloperLife
{
	void wakeup() {
		System.out.println("It's a new Day!!!");
	}
	
	void code(String name) {
		System.out.println("Hey "+name+"! You're Coding in Java");
	}
	
	void takeABreak() {
		System.out.println("Time To Have A BreaK");
	}
	
	void test(int n) {
		System.out.println("Found "+n+" Bugs");
	}
}