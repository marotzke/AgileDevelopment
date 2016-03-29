package agile.vision;

import java.awt.Dimension;
import javax.swing.JPanel;

public class Screen extends JPanel{
	
	//Implement the GUI using Swing
	
	private static final long serialVersionUID = 1L;
		
	private int width;
	private int height;
	
	public Screen(){
		this.width  = 2000;
		this.height = 2000;
		
		setPreferredSize(new Dimension(this.width, this.height));
	}
}
