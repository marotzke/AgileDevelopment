package agile.model.test;

import org.junit.Assert;
import org.junit.Test;

import agile.model.XorGate;
import agile.model.InputPin;
import agile.model.Switch;

public class XorGateTest {
	@Test
	public void xorGateHigh(){
		Switch s = new Switch();
		XorGate xor = new XorGate();
		
		InputPin pinA = xor.getInputPin(0);
		InputPin pinB = xor.getInputPin(1);
		
		s.setSignalHigh();
		pinA.setSource(s);
		pinB.setSource(s);
		
		xor.setPin(pinA, pinB);
		
		
		Assert.assertFalse(xor.getOutputValue(0));
	}
		
		@Test
		public void xorGateLow(){
			Switch s = new Switch();
			XorGate xor = new XorGate();
			
			InputPin pinA = xor.getInputPin(0);
			InputPin pinB = xor.getInputPin(1);
			
			s.setSignalLow();
			pinA.setSource(s);
			pinB.setSource(s);
			
			xor.setPin(pinA, pinB);
			
			
			Assert.assertFalse(xor.getOutputValue(0));
		}
		
		@Test
		public void xorGateDeferentInput(){
			Switch s = new Switch();
			XorGate xor = new XorGate();
			
			InputPin pinA = xor.getInputPin(0);
			InputPin pinB = xor.getInputPin(1);
			
			s.setSignalHigh();
			pinA.setSource(s);
			s.setSignalLow();
			pinB.setSource(s);
			
			xor.setPin(pinA, pinB);
			
			
			Assert.assertTrue(xor.getOutputValue(0));
		}
		
	}
