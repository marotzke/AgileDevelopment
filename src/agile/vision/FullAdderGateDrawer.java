package agile.vision;

import java.awt.Graphics;
import agile.model.FullAdderGate;
import agile.model.InputPin;
import agile.model.Lamp;
import agile.model.Source;

public class FullAdderGateDrawer extends GateDrawer{
	
	private FullAdderGate fa;
	private InputPin pinA;
	private InputPin pinB;
	private InputPin pinC;
	private Lamp lampA;
	private Lamp lampB;
	
	public FullAdderGateDrawer(){
		fa = new FullAdderGate();
		gateName = "FULL-ADDER";
		lampA = new Lamp(0);
		lampB = new Lamp(1);
		pinA = fa.getInputPin(0);
		pinB = fa.getInputPin(1);
		pinC = fa.getInputPin(2);
	}
	public void drawGate(Graphics g){
		
		g.drawLine(locationX+size*2, locationY+size*5, locationX+size*10, locationY+size*5);
		g.drawLine(locationX+size*2, locationY+size*10, locationX+size*10, locationY+size*10);
		g.drawLine(locationX+size*2, locationY+size*14, locationX+size*10, locationY+size*14);
		g.drawLine(locationX+size*10, locationY+size*3, locationX+size*10, locationY+size*18);
		g.drawLine(locationX+size*16, locationY+size*3, locationX+size*16, locationY+size*18);
		g.drawLine(locationX+size*10, locationY+size*3, locationX+size*16, locationY+size*3);
		g.drawLine(locationX+size*10, locationY+size*18, locationX+size*16, locationY+size*18);
		g.drawLine(locationX+size*16,locationY+size*7,locationX+size*22,locationY+size*7);
		g.drawLine(locationX+size*16,locationY+size*10,locationX+size*22,locationY+size*10);
		g.drawString("Full Adder", locationX+10+size*11, locationY+size*11);
		g.drawString("Carry-In", locationX+size*5, locationY+size*14);


	}
	
	@Override
	public boolean calculateOutputValue(Source sa,Source sb,Source sc, int index){
		
		pinA.setSource(sa);
		pinB.setSource(sb);
		pinC.setSource(sc);
		
		fa.setPin(pinA, pinB, pinC);
		lampA.setPinLampSource(fa);
		lampB.setPinLampSource(fa);
		
		if (index == 0){
			
		return lampA.isOn();
		
		} else {
			return lampB.isOn();
		}
	}
}
