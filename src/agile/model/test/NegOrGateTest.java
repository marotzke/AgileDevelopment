package agile.model.test;

import org.junit.Assert;
import org.junit.Test;

import agile.model.NegOrGate;
import agile.model.InputPin;
import agile.model.Switch;

public class NegOrGateTest {
	@Test
	public void NegOrGateBothHigh(){
		Switch s = new Switch();
		NegOrGate negor = new NegOrGate();
		
		InputPin pinA = negor.getInputPin(0);
		InputPin pinB = negor.getInputPin(1);
		
		s.setSignalHigh();
		pinA.setSource(s);
		pinB.setSource(s);
		
		negor.setPin(pinA, pinB);
		
		
		Assert.assertFalse(negor.getOutputValue(0));
		
	}
	
	@Test
	public void NegOrGateBothLow(){
		Switch s = new Switch();
		NegOrGate negor = new NegOrGate();
		
		InputPin pinA = negor.getInputPin(0);
		InputPin pinB = negor.getInputPin(1);
		
		s.setSignalLow();
		pinA.setSource(s);
		pinB.setSource(s);
		
		negor.setPin(pinA, pinB);
		
		
		Assert.assertTrue(negor.getOutputValue(0));
		
	}
	
	@Test
	public void NegOrGateDiferentInput(){
		Switch s = new Switch();
		NegOrGate negor = new NegOrGate();
		
		InputPin pinA = negor.getInputPin(0);
		InputPin pinB = negor.getInputPin(1);
		
		s.setSignalLow();
		pinA.setSource(s);
		s.setSignalHigh();
		pinB.setSource(s);
		
		negor.setPin(pinA, pinB);
		
		
		Assert.assertTrue(negor.getOutputValue(0));
		
	}
}
