package agile.vision;

import java.awt.Dimension;
import javax.swing.JPanel;

public class Screen extends JPanel{
	
	//Implement the GUI using Swing
	
	private static final long serialVersionUID = 1L;
	
	private final static int CELL_SIZE = 25;
	
	private int width;
	private int height;
	
	public Screen(){
		this.width  = 20;
		this.height = 20;
		
		setPreferredSize(new Dimension(this.width * CELL_SIZE, this.height * CELL_SIZE));
	}
}
