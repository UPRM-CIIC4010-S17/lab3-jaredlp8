import javax.swing.JFrame;

public class Lab3Exercises {
	public static void main(String[] args) {
		JFrame myFrame = new JFrame("Jared Lopez");
		myFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		myFrame.setLocation(400, 450);
		myFrame.setSize(350,203);
		MyPanelClass myPanel = new MyPanelClass(); 
		 myFrame.getContentPane().add(myPanel);
		myFrame.setVisible(true);
	}
}