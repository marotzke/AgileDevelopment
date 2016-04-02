package agile.vision;

import java.awt.Graphics;

public class HalfAdderGateDrawer extends GateDrawer{
	public HalfAdderGateDrawer(){
		gateName = "HALF-ADDER";
	}
	public void drawGate(Graphics g){
		
		g.drawLine(size*5, size*5, size*10, size*5);
		g.drawLine(size*5, size*10, size*10, size*10);
		g.drawLine(size*10, size*2, size*10, size*12);
		g.drawLine(size*20, size*2, size*20, size*12);
		g.drawLine(size*10, size*2, size*20, size*2);
		g.drawLine(size*10, size*12, size*20, size*12);
		g.drawLine(size*20,size*7,size*25,size*7);
	}
}