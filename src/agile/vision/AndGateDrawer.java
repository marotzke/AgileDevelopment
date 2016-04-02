package agile.vision;

import java.awt.Graphics;

public class AndGateDrawer extends GateDrawer{
	
	public AndGateDrawer(){
		gateName = "AND";
	}
	public void drawGate(Graphics g) {
		
		g.drawLine(size*5, size*5, size*10, size*5);
		g.drawLine(size*5, size*10, size*10, size*10);
		g.drawLine(size*10, size*2, size*10, size*12);
		g.drawArc(size*6, size*2, size*10, size*10, -100, 200);
		g.drawLine(size*16,size*7,size*22,size*7);

	}
}
