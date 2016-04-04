package agile.vision;

import java.awt.Graphics;

import agile.model.InputPin;
import agile.model.Lamp;
import agile.model.AndGate;
import agile.model.Source;

public class AndGateDrawer extends GateDrawer{
	
	private AndGate and;
	private Lamp lampA;
	
	public AndGateDrawer(){
		and = new AndGate();
		gateName = "AND";
		lampA = new Lamp(0);
	}
	public void drawGate(Graphics g) {
		g.drawLine(locationX+size*2, locationY+size*5, locationX+size*10, locationY+size*5);
		g.drawLine(locationX+size*2, locationY+size*10, locationX+size*10, locationY+size*10);
		g.drawLine(locationX+size*10, locationY+size*2, locationX+size*10, locationY+size*12);
		g.drawArc(locationX+size*6, locationY+size*2, size*10, size*10, -100, 200);
		g.drawLine(locationX+size*16,locationY+size*7,locationX+size*22,locationY+size*7);
		
		this.drawGround(g);
		this.drawGroundCarry(g);

	}
	@Override
	public boolean calculateOutputValue(Source sa,Source sb,Source sc, int index){
		InputPin pinA = and.getInputPin(0);
		InputPin pinB = and.getInputPin(1);
		
		pinA.setSource(sa);
		pinB.setSource(sb);
		
		lampA.setPinLampSource(and);
		and.setPin(pinA, pinB);
		if(index == 0){
			return lampA.isOn();
		}
		else{
			return false;
		}
	}
}
