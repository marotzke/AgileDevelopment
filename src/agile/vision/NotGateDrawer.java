package agile.vision;

import java.awt.Graphics;

public class NotGateDrawer extends GateDrawer{
	public NotGateDrawer(){
		gateName = "NOT";
	}
	public void drawGate(Graphics g){
			
		g.drawLine(locationX+size*10, locationY+size*4, locationX+size*16, locationY+size*7);
		g.drawLine(locationX+size*10, locationY+size*10, locationX+size*16, locationY+size*7);
		g.drawLine(locationX+size*10, locationY+size*4, locationX+size*10, locationY+size*10);
		g.drawLine(locationX+size*5, locationY+size*7, locationX+size*10, locationY+size*7);
		g.drawLine(locationX+size*18, locationY+size*7, locationX+size*23, locationY+size*7);
		g.drawArc(locationX+size*16, locationY+size*6, size*2, size*2, -20, 360);
	}
}
