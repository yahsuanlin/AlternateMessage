import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AlternateMessageTest {
	/** Main method */
	public static void main(String[] args) {
		JFrame frame = new AlternateMessage();
		frame.setTitle("AlternateTwoMessage");
		frame.setSize(200,100);
		frame.setLocationRelativeTo(null); // Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	  }	
}
