package agile.vision;

import java.awt.Graphics;

import agile.model.XorGate;
import agile.model.InputPin;
import agile.model.Source;

public class XorGateDrawer extends GateDrawer{
	
	private XorGate xor;
	
	public XorGateDrawer(){
		xor = new XorGate();
		gateName = "XOR";
	}
	public void drawGate(Graphics g) {
		g.drawLine(locationX+size*5, locationY+size*5, locationX+size*10, locationY+size*5);
		g.drawLine(locationX+size*5, locationY+size*10, locationX+size*10, locationY+size*10);
		g.drawArc(locationX+size*7, locationY+size*2, size*3, size*11, -100, 200);
		g.drawArc(locationX+size*3, locationY+size*2, size*13, size*11, -100, 200);
		g.drawArc(locationX+size*6, locationY+size*2, size*3, size*11, -100, 200);
		g.drawLine(locationX+size*16,locationY+size*7,locationX+size*22,locationY+size*7);
		


		}
	
	@Override
	public boolean calculateOutputValue(Source sa,Source sb,Source sc, int index){
		InputPin pinA = xor.getInputPin(0);
		InputPin pinB = xor.getInputPin(1);
		
		pinA.setSource(sa);
		pinB.setSource(sb);
		
		xor.setPin(pinA, pinB);
		return xor.getOutputValue(0);
	}
}
