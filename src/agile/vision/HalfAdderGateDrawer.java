package agile.vision;

import java.awt.Graphics;

import agile.model.HalfAdderGate;
import agile.model.InputPin;
import agile.model.Source;

public class HalfAdderGateDrawer extends GateDrawer{
	private HalfAdderGate ha;
	
	public HalfAdderGateDrawer(){
		ha = new HalfAdderGate();
		gateName = "HALF-ADDER";
	}
	public void drawGate(Graphics g){
		
		g.drawLine(locationX+size*5, locationY+size*5, locationX+size*10, locationY+size*5);
		g.drawLine(locationX+size*5, locationY+size*10, locationX+size*10, locationY+size*10);
		g.drawLine(locationX+size*10, locationY+size*3, locationX+size*10, locationY+size*12);
		g.drawLine(locationX+size*16, locationY+size*3, locationX+size*16, locationY+size*12);
		g.drawLine(locationX+size*10, locationY+size*3, locationX+size*16, locationY+size*3);
		g.drawLine(locationX+size*10, locationY+size*12, locationX+size*16, locationY+size*12);
		g.drawLine(locationX+size*16,locationY+size*5,locationX+size*22,locationY+size*5);
		g.drawLine(locationX+size*16,locationY+size*10,locationX+size*22,locationY+size*10);
		

	}
	
	@Override
	public boolean calculateOutputValue(Source sa,Source sb,Source sc, int index){
		InputPin pinA = ha.getInputPin(0);
		InputPin pinB = ha.getInputPin(1);
		
		pinA.setSource(sa);
		pinB.setSource(sb);
		
		ha.setPin(pinA, pinB);
		return ha.getOutputValue(index);
	}
}