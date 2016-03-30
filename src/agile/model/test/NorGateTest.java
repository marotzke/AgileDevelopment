package agile.model.test;

import org.junit.Assert;
import org.junit.Test;

import agile.model.NorGate;
import agile.model.InputPin;
import agile.model.Switch;

public class NorGateTest {
	
	@Test
	public void norGateBothHigh(){
		Switch s = new Switch();
		NorGate nor = new NorGate();
		
		InputPin pinA = nor.getInputPin(0);
		InputPin pinB = nor.getInputPin(1);
		
		s.setSignalHigh();
		pinA.setSource(s);
		pinB.setSource(s);
		
		nor.setPin(pinA, pinB);
		
		
		Assert.assertFalse(nor.getOutputValue(0));
		
	}
	
	@Test
	public void norGateBothLow(){
		Switch s = new Switch();
		NorGate nor = new NorGate();
		
		InputPin pinA = nor.getInputPin(0);
		InputPin pinB = nor.getInputPin(1);
		
		s.setSignalLow();
		pinA.setSource(s);
		pinB.setSource(s);
		
		nor.setPin(pinA, pinB);
		
		
		Assert.assertTrue(nor.getOutputValue(0));
		
	}
	
	@Test
	public void norGateDiferentInput(){
		Switch s = new Switch();
		NorGate nor = new NorGate();
		
		InputPin pinA = nor.getInputPin(0);
		InputPin pinB = nor.getInputPin(1);
		
		s.setSignalHigh();
		pinA.setSource(s);
		s.setSignalLow();
		pinB.setSource(s);
		
		nor.setPin(pinA, pinB);
		
		
		Assert.assertFalse(nor.getOutputValue(0));
		
	}
}
