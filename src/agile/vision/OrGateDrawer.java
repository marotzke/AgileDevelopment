package agile.vision;

import java.awt.Graphics;

public class OrGateDrawer extends GateDrawer{
	public OrGateDrawer(){
		gateName = "OR";
	}
	public void drawGate(Graphics g){	
		
		g.drawLine(size*5, size*5, size*10, size*5);
		g.drawLine(size*5, size*10, size*10, size*10);
		g.drawArc(size*7, size*2, size*3, size*10, -100, 200);
		g.drawArc(size*3, size*2, size*13, size*10, -100, 200);
		g.drawLine(size*16,size*7,size*22,size*7);
	}

}
