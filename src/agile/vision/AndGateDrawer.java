package agile.vision;

import java.awt.Graphics;

import agile.model.InputPin;
import agile.model.AndGate;
import agile.model.Source;

public class AndGateDrawer extends GateDrawer{
	
	private AndGate and;
	
	public AndGateDrawer(){
		and = new AndGate();
		gateName = "AND";
	}
	public void drawGate(Graphics g) {
		//só alterei os valores de 5 para 2
		//                        v <-- Aqui
		g.drawLine(locationX+size*2, locationY+size*5, locationX+size*10, locationY+size*5);
		g.drawLine(locationX+size*2, locationY+size*10, locationX+size*10, locationY+size*10);
		g.drawLine(locationX+size*10, locationY+size*2, locationX+size*10, locationY+size*12);
		g.drawArc(locationX+size*6, locationY+size*2, size*10, size*10, -100, 200);
		g.drawLine(locationX+size*16,locationY+size*7,locationX+size*22,locationY+size*7);
		

	}
	@Override
	public boolean calculateOutputValue(Source sa,Source sb,Source sc, int index){
		InputPin pinA = and.getInputPin(0);
		InputPin pinB = and.getInputPin(1);
		
		pinA.setSource(sa);
		pinB.setSource(sb);
		
		and.setPin(pinA, pinB);
		if(index == 0){
			return and.getOutputValue(0);
		}
		else{
			return false;
		}
	}
}
