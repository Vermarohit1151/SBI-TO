
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class FrameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame myFrame1 = new MyFrame(400, 400, 700, 200,"My Car");
		MyFrame myFrame2 = new MyFrame(400,400,500,200,"My Train");	
		
		myFrame1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		myFrame2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		Thread t20 = new Thread(myFrame1);
		
		Thread t21 = new Thread(myFrame2);
		t20.start();
		t21.start();
	}

}

class MyFrame extends JFrame implements Runnable{
	JTextField field1 = new JTextField(15); 
	String title;
	MyFrame(int w, int h, int x, int y, String Title){
		
	super.setSize(w,h);
	super.setLocation(x, y);
	this.title = Title;
	super.setTitle(Title);
	super.setVisible(true);
	super.setLayout(new FlowLayout());
	super.add(field1);
	
	}
	
	public void run() {
		for(int i = 0; i <= 1000; i++) {
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			field1.setText(title+" is running "+i);
		}
	}
}