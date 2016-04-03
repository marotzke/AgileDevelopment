package agile.vision;

import java.awt.Graphics;

import agile.model.NegAndGate;
import agile.model.InputPin;
import agile.model.Source;

public class NegAndGateDrawer  extends GateDrawer{

	private NegAndGate negand;
	
	public NegAndGateDrawer(){
		negand = new NegAndGate();
		gateName = "NEG-AND";
	}
	public void drawGate(Graphics g) {
		g.drawLine(locationX+size*5, locationY+size*5, locationX+size*8, locationY+size*5);
		g.drawLine(locationX+size*5, locationY+size*10, locationX+size*8, locationY+size*10);
		g.drawArc(locationX+size*8, locationY+size*4, size*2, size*2, -20, 360);
		g.drawArc(locationX+size*8, locationY+size*9, size*2, size*2, -20, 360);
		g.drawLine(locationX+size*10, locationY+size*2, locationX+size*10, locationY+size*12);
		g.drawArc(locationX+size*6, locationY+size*2, size*10, size*10, -100, 200);
		g.drawLine(locationX+size*16,locationY+size*7,locationX+size*22,locationY+size*7);
		
		switch1.setBounds(locationX+size*4,locationY+size*4, switchSize.width, switchSize.height);
		switch2.setBounds(locationX+size*4,locationY+size*9, switchSize.width, switchSize.height);
		lampA.setBounds(locationX+size*20,locationY+size*6, switchSize.width, switchSize.height);
		switch1.setVisible(true);
		switch2.setVisible(true);
		switch3.setVisible(false);
		lampA.setVisible(true);
	}
	
	@Override
	public boolean calculateOutputValue(Source sa,Source sb,Source sc, int index){
		InputPin pinA = negand.getInputPin(0);
		InputPin pinB = negand.getInputPin(1);
		
		pinA.setSource(sa);
		pinB.setSource(sb);
		
		negand.setPin(pinA, pinB);
		return negand.getOutputValue(0);
	}

}
