package agile.vision;

import java.awt.Graphics;

public class HalfAdderGateDrawer extends GateDrawer{
	public HalfAdderGateDrawer(){
		gateName = "HALF-ADDER";
	}
	public void drawGate(Graphics g){
		
		g.drawLine(locationX+size*5, locationY+size*5, locationX+size*10, locationY+size*5);
		g.drawLine(locationX+size*5, locationY+size*10, locationX+size*10, locationY+size*10);
		g.drawLine(locationX+size*10, locationY+size*3, locationX+size*10, locationY+size*12);
		g.drawLine(locationX+size*16, locationY+size*3, locationX+size*16, locationY+size*12);
		g.drawLine(locationX+size*10, locationY+size*3, locationX+size*16, locationY+size*3);
		g.drawLine(locationX+size*10, locationY+size*12, locationX+size*16, locationY+size*12);
		g.drawLine(locationX+size*16,locationY+size*7,locationX+size*22,locationY+size*7);
	}
}