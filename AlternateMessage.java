import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AlternateMessage extends JFrame {
  //create a RotateMessagePanel instance for rotating two messages
  private RotateMessagePanel panel = new RotateMessagePanel();
  
  public AlternateMessage() {
	//place the message panel in the frame 
	add(panel, BorderLayout.CENTER);
    panel.setFocusable(true);
  }

  class RotateMessagePanel extends JPanel {
	private String msg1 = "Java is fun";
    private String msg2 = "Java is powerful";
    private String message = msg1; // Message to display	
	
	/** Contruct a panel to rotate two msgs */
    public RotateMessagePanel() {
		addMouseListener(new MouseAdapter() {
			/** Handle mouse-clicked event */
			public void mouseClicked(MouseEvent e) {
			  if(message.equals(msg1))
				message = msg2;
			  else 
				message = msg1;	
				
			repaint();	
        }
      });
    }

	protected void paintComponent(Graphics g) {
		super.paintComponent(g); 
		FontMetrics fm = g.getFontMetrics();
		int sw = fm.stringWidth(message);
		int sa = fm.getAscent();
		int x = getWidth()/2-sw/2;
		int y = getHeight()/2+sa/2; g.drawString(message, x, y);
	}
  }
}
