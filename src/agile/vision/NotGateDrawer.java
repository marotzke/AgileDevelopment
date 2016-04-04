package agile.vision;

import java.awt.Graphics;

import agile.model.InputPin;
import agile.model.NotGate;
import agile.model.Source;

public class NotGateDrawer extends GateDrawer{
	
	private NotGate not;
	private InputPin pin;
	
	public NotGateDrawer(){
		not = new NotGate();
		gateName = "NOT";
		
		pin = not.getInputPin(0);
	}
	public void drawGate(Graphics g){

		g.drawLine(locationX+size*2, locationY+size*5, locationX+size*5, locationY+size*5);
		g.drawLine(locationX+size*5, locationY+size*5, locationX+size*5, locationY+size*7);		
		g.drawLine(locationX+size*10, locationY+size*4, locationX+size*16, locationY+size*7);
		g.drawLine(locationX+size*10, locationY+size*10, locationX+size*16, locationY+size*7);
		g.drawLine(locationX+size*10, locationY+size*4, locationX+size*10, locationY+size*10);
		g.drawLine(locationX+size*5, locationY+size*7, locationX+size*10, locationY+size*7);
		g.drawLine(locationX+size*18, locationY+size*7, locationX+size*22, locationY+size*7);
		g.drawArc(locationX+size*16, locationY+size*6, size*2, size*2, -20, 360);
		
		g.drawLine(locationX+size*2, locationY+size*10, locationX+size*5, locationY+size*10);
		g.drawLine(locationX+size*2, locationY+size*14, locationX+size*5, locationY+size*14);		
		g.drawLine(locationX+size*5, locationY+size*10, locationX+size*5, locationY+size*16);
		g.drawLine(locationX+size*3, locationY+size*16, locationX+size*7, locationY+size*16);
		g.drawLine(locationX+size*4, locationY+10+size*16, locationX+size*6, locationY+10+size*16);
		g.drawLine(locationX+10+size*4, locationY+20+size*16, locationX-10+size*6, locationY+20+size*16);
		
		this.drawGroundCarry(g);

	}
	
	@Override
	public boolean calculateOutputValue(Source sa,Source sb,Source sc, int index){

		pin.setSource(sa);
		not.setPin(pin);
		if(index == 0){
			return not.getOutputValue(0);
		}
		else{
			return false;
		}	}

	
}
