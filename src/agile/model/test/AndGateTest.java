package agile.model.test;

import agile.model.*;
import org.junit.Assert;
import org.junit.Test;

public class AndGateTest {
	
	@Test
	public void andGateBothLow(){
		Switch s = new Switch();
		AndGate and = new AndGate();
		
		InputPin pinA = and.getInputPin(0);
		InputPin pinB = and.getInputPin(1);
		
		pinA.setSource(s);
		pinB.setSource(s);
		
		and.setPin(pinA, pinB);
		
		
		Assert.assertFalse(and.getOutputValue(0));
		
	}
	
	@Test
	public void andGateDiferentInput(){
		Switch s = new Switch();
		AndGate and = new AndGate();
		
		InputPin pinA = and.getInputPin(0);
		InputPin pinB = and.getInputPin(1);
		
		s.setSignalHigh();
		pinA.setSource(s);
		
		s.setSignalLow();
		pinB.setSource(s);
		
		and.setPin(pinA, pinB);
		
		
		Assert.assertFalse(and.getOutputValue(0));
		
	}
	
	
	@Test
	public void andGateBothHigh(){
		Switch s = new Switch();
		AndGate and = new AndGate();
		
		InputPin pinA = and.getInputPin(0);
		InputPin pinB = and.getInputPin(1);
		
		s.setSignalHigh();
		pinA.setSource(s);
		pinB.setSource(s);
		
		and.setPin(pinA, pinB);
		
		
		Assert.assertTrue(and.getOutputValue(0));
		
	}
}
