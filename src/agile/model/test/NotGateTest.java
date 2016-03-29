package agile.model.test;

import org.junit.Assert;
import org.junit.Test;

import agile.model.InputPin;
import agile.model.NotGate;
import agile.model.Switch;

public class NotGateTest {
		
	@Test
	public void notGateBothLow(){
		Switch s = new Switch();
		NotGate not = new NotGate();
		
		InputPin pin = not.getInputPin(0);
		
		s.setSignalHigh();
		pin.setSource(s);
		not.setPin(pin);
		
		
		Assert.assertFalse(not.getOutputValue(0));
		
	}
	
	@Test
	public void notGateDiferentInput(){
		Switch s = new Switch();
		NotGate not = new NotGate();
		
		InputPin pin = not.getInputPin(0);
		
		s.setSignalLow();
		pin.setSource(s);
		not.setPin(pin);
		
		
		Assert.assertTrue(not.getOutputValue(0));
		
	}
}
