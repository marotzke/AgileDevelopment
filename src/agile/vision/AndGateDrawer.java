package agile.vision;

import java.awt.Graphics;

public class AndGateDrawer extends GateDrawer{
	public AndGateDrawer(){
		gateName = "AND";
	}
	public void drawGate(Graphics g) {

		g.drawLine(locationX+size*5, locationY+size*5, locationX+size*10, locationY+size*5);
		g.drawLine(locationX+size*5, locationY+size*10, locationX+size*10, locationY+size*10);
		g.drawLine(locationX+size*10, locationY+size*2, locationX+size*10, locationY+size*12);
		g.drawArc(locationX+size*6, locationY+size*2, size*10, size*10, -100, 200);
		g.drawLine(locationX+size*16,locationY+size*7,locationX+size*22,locationY+size*7);

	}
}
