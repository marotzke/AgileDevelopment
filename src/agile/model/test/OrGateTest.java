package agile.model.test;

import org.junit.Assert;
import org.junit.Test;

import agile.model.OrGate;
import agile.model.InputPin;
import agile.model.Switch;

public class OrGateTest {
	
	@Test
	public void orGateBothLow(){
		Switch s = new Switch();
		OrGate or = new OrGate();
		
		InputPin pinA = or.getInputPin(0);
		InputPin pinB = or.getInputPin(1);
		
		pinA.setSource(s);
		pinB.setSource(s);
		
		or.setPin(pinA, pinB);
		
		
		Assert.assertFalse(or.getOutputValue(0));
		
	}
	
	@Test
	public void orGateDiferentInput(){
		Switch s = new Switch();
		Switch s1 = new Switch();
		OrGate or = new OrGate();
		
		InputPin pinA = or.getInputPin(0);
		InputPin pinB = or.getInputPin(1);
		
		s.setSignalHigh();
		pinA.setSource(s);
		s1.setSignalLow();
		pinB.setSource(s1);
		
		or.setPin(pinA, pinB);
				
		Assert.assertTrue(or.getOutputValue(0));
		
	}
	
	
	@Test
	public void orGateBothHigh(){
		Switch s = new Switch();
		OrGate or = new OrGate();
		
		InputPin pinA = or.getInputPin(0);
		InputPin pinB = or.getInputPin(1);
		
		s.setSignalHigh();
		pinA.setSource(s);
		pinB.setSource(s);
		
		or.setPin(pinA, pinB);
		
		
		Assert.assertTrue(or.getOutputValue(0));
		
	}
}
