package agile.vision;

import java.awt.Graphics;

import agile.model.InputPin;
import agile.model.MuxGate;
import agile.model.Source;

public class MuxGateDrawer extends GateDrawer{
	
	private MuxGate mux;
	private InputPin pinA;
	private InputPin pinB;
	private InputPin pinC;
	
	public MuxGateDrawer(){
		mux = new MuxGate();
		gateName = "MUX";
		
		pinA = mux.getInputPin(0);
		pinB = mux.getInputPin(1);
		pinC = mux.getInputPin(2);
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
		g.drawString("Multiplex", locationX+10+size*11, locationY+size*11);
		g.drawString("Selector", locationX+size*5, locationY+size*14);
		
		this.drawGroundCarry(g);
	}
	
	@Override
	public boolean calculateOutputValue(Source sa,Source sb,Source sc, int index){
		
		pinA.setSource(sa);
		pinB.setSource(sb);
		pinC.setSource(sc);
		
		mux.setPin(pinA, pinB, pinC);
		
		if(index == 0){
			return mux.getOutputValue(0);
		}
		else{
			return false;
		}	
	}	
}