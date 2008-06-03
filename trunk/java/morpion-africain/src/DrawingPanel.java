import javax.swing.*;
import java.awt.*;
class DrawingPanel extends JPanel {
		     private Image img = null;
		    
		     DrawingPanel(Image image)
		     { img = image; }
		  
		     public void paintComponent(Graphics g) {
		         // First paint background unless you will
		         // paint whole area yourself.
		         super.paintComponent(g);
		        
		         // Use the image width & height to find the starting point
		         //int msgX = getSize().width/2 - img.getWidth(this);
		         //int msgY = getSize().height/2 - img.getHeight(this);
		        
		         //Draw image at centered in the middle of the panel
		         g.drawImage(img, 10, 10, this);
		     }
}

