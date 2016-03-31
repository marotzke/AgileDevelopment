package agile.vision;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Screen extends JPanel{
	
	//Implement the GUI using Swing
	
	private static final long serialVersionUID = 1L;
		
	private int width;
	private int height;
	
	public Screen(){
		this.width  = 500;
		this.height = 500;
		
		setPreferredSize(new Dimension(this.width, this.height));
	}
	
	public void paintComponent(Graphics g) {
		drawAndGate(g);
	}
	
	public void drawAndGate(Graphics g) {
		int size  = 15;
		
		g.drawLine(size*5, size*5, size*10, size*5);
		g.drawLine(size*5, size*10, size*10, size*10);
		g.drawLine(size*10, size*2, size*10, size*12);
		g.drawArc(size*6, size*2, size*10, size*10, -100, 200);
		g.drawLine(size*16,size*7,size*22,size*7);
		
		getToolkit().sync();
	}
}
