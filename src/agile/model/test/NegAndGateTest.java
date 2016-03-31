package agile.model.test;

import org.junit.Assert;
import org.junit.Test;

import agile.model.NegAndGate;
import agile.model.InputPin;
import agile.model.Switch;

public class NegAndGateTest {
	@Test
	public void negAndGateBothHigh(){
		Switch s = new Switch();
		NegAndGate negand = new NegAndGate();
		
		InputPin pinA = negand.getInputPin(0);
		InputPin pinB = negand.getInputPin(1);
		
		s.setSignalHigh();
		pinA.setSource(s);
		pinB.setSource(s);
		
		negand.setPin(pinA, pinB);
		
		
		Assert.assertFalse(negand.getOutputValue(0));
		
	}
	
	@Test
	public void negAndGateBothLow(){
		Switch s = new Switch();
		NegAndGate negand = new NegAndGate();
		
		InputPin pinA = negand.getInputPin(0);
		InputPin pinB = negand.getInputPin(1);
		
		s.setSignalLow();
		pinA.setSource(s);
		pinB.setSource(s);
		
		negand.setPin(pinA, pinB);
		
		
		Assert.assertTrue(negand.getOutputValue(0));
		
	}
	
	@Test
	public void negAndGateDiferentInput(){
		Switch s = new Switch();
		Switch s2 = new Switch();
		
		NegAndGate negand = new NegAndGate();
		
		InputPin pinA = negand.getInputPin(0);
		InputPin pinB = negand.getInputPin(1);
		
		s.setSignalHigh();
		pinA.setSource(s);
		s2.setSignalLow();
		pinB.setSource(s2);
		
		negand.setPin(pinA, pinB);
		
		
		Assert.assertFalse(negand.getOutputValue(0));
		
	}
}
