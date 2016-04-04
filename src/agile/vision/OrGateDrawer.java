package agile.vision;

import java.awt.Graphics;

import agile.model.OrGate;
import agile.model.InputPin;
import agile.model.Source;

public class OrGateDrawer extends GateDrawer{
	
	private OrGate or;
	
	public OrGateDrawer(){
		or = new OrGate();
		gateName = "OR";
	}
	public void drawGate(Graphics g){	
		
		g.drawLine(locationX+size*5, locationY+size*5, locationX+size*10, locationY+size*5);
		g.drawLine(locationX+size*5, locationY+size*10, locationX+size*10, locationY+size*10);
		g.drawArc(locationX+size*7, locationY+size*2, size*3, size*11, -100, 200);
		g.drawArc(locationX+size*3, locationY+size*2, size*13, size*11, -100, 200);
		g.drawLine(locationX+size*16,locationY+size*7,locationX+size*22,locationY+size*7);

	}
	
	@Override
	public boolean calculateOutputValue(Source sa,Source sb,Source sc, int index){
		InputPin pinA = or.getInputPin(0);
		InputPin pinB = or.getInputPin(1);
		
		pinA.setSource(sa);
		pinB.setSource(sb);
		
		or.setPin(pinA, pinB);
		return or.getOutputValue(0);
	}

}
