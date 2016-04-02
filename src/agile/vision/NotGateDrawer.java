package agile.vision;

import java.awt.Graphics;

public class NotGateDrawer extends GateDrawer{
	public NotGateDrawer(){
		gateName = "NOT";
	}
	public void drawGate(Graphics g){
		
		g.drawLine(size*10, size*5, size*16, size*8);
		g.drawLine(size*10, size*11, size*16, size*8);
		g.drawLine(size*10, size*5, size*10, size*11);
		g.drawLine(size*5, size*8, size*10, size*8);
		g.drawLine(size*18, size*8, size*23, size*8);
		g.drawArc(size*16, size*7, size*2, size*2, -20, 360);
	}
}
