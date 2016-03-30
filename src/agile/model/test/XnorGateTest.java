package agile.model.test;

import org.junit.Assert;
import org.junit.Test;

import agile.model.XnorGate;
import agile.model.InputPin;
import agile.model.Switch;

public class XnorGateTest {
	@Test
	public void xnorGateBothHigh(){
		Switch s = new Switch();
		XnorGate xnor = new XnorGate();
		
		InputPin pinA = xnor.getInputPin(0);
		InputPin pinB = xnor.getInputPin(1);
		
		s.setSignalHigh();
		pinA.setSource(s);
		pinB.setSource(s);
		
		xnor.setPin(pinA, pinB);
		
		
		Assert.assertTrue(xnor.getOutputValue(0));
		
	}
	
	@Test
	public void xnorGateBothLow(){
		Switch s = new Switch();
		XnorGate xnor = new XnorGate();
		
		InputPin pinA = xnor.getInputPin(0);
		InputPin pinB = xnor.getInputPin(1);
		
		s.setSignalLow();
		pinA.setSource(s);
		pinB.setSource(s);
		
		xnor.setPin(pinA, pinB);
		
		
		Assert.assertTrue(xnor.getOutputValue(0));
		
	}
	
	@Test
	public void xnorGateDiferentInput(){
		Switch s = new Switch();
		XnorGate xnor = new XnorGate();
		
		InputPin pinA = xnor.getInputPin(0);
		InputPin pinB = xnor.getInputPin(1);
		
		s.setSignalHigh();
		pinA.setSource(s);
		s.setSignalLow();
		pinB.setSource(s);
		
		xnor.setPin(pinA, pinB);
		
		
		Assert.assertFalse(xnor.getOutputValue(0));
		
	}
}
