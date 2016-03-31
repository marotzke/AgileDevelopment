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
	public void xnorGate10(){
		
		Switch s = new Switch();
		Switch s1 = new Switch();
		XnorGate xnor = new XnorGate();
		
		InputPin pinA = xnor.getInputPin(0);
		InputPin pinB = xnor.getInputPin(1);
		
		s.setSignalHigh();
		pinA.setSource(s);
		s1.setSignalLow();
		pinB.setSource(s1);
		
		xnor.setPin(pinA, pinB);
		
		
		Assert.assertFalse(xnor.getOutputValue(0));
		
	}
	
	@Test
	public void xnorGate01(){
		Switch s = new Switch();
		Switch s1 = new Switch();
		XnorGate xnor = new XnorGate();
		
		InputPin pinA = xnor.getInputPin(0);
		InputPin pinB = xnor.getInputPin(1);
		
		s.setSignalLow();
		pinA.setSource(s);
		s1.setSignalHigh();
		pinB.setSource(s1);
		
		xnor.setPin(pinA, pinB);
		
		
		Assert.assertFalse(xnor.getOutputValue(0));
		
	}
}
