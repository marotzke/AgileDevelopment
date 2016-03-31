package agile.vision;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import javax.swing.*;

public class Screen extends JPanel {
	
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
		int size  = 5;
		
		g.drawLine(size*5, size*5, size*10, size*5);
		g.drawLine(size*5, size*10, size*10, size*10);
		g.drawLine(size*10, size*2, size*10, size*12);
		g.drawArc(size*6, size*2, size*10, size*10, -100, 200);
		g.drawLine(size*16,size*7,size*22,size*7);
		
		getToolkit().sync();
		
	}
	
	public void setupScreen(Screen screen){
        JFrame frame = new JFrame("LogicGate Program");
        
		JButton button = new JButton();
		button.setText("Press me");
		button.setLocation(25, 200);
		
		screen.setLayout(new FlowLayout());
		
		JLabel label = new JLabel("This is a label!");
		
		screen.add(label);
		screen.add(button);
		
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setContentPane(screen);
        frame.pack();
        frame.setVisible(true);
	}
}
