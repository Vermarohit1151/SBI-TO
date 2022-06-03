
public class ChessTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chess c = new Chess();
		c.moveBishop();
		c.moveQueen();
		c.moveBishop();
	}

}

class Chess{
	
	final int TOTAL_SQUARE = 64;
	
	final void moveBishop() {    //Math Logic
		System.out.println("Cross Bi-directional movement... by Bishop");
	}
	
	final void moveQueen() {
		System.out.println("Horizontal/Vertical/Cross.. bi- directional movement... by Queen");
	}
	
}

class GraphicalChess extends Chess{
	void moveMyBishop(){
		
		super.moveBishop();
		System.out.println("Moving Bishop in a graphical view.. using logic defined in super");
	}
}