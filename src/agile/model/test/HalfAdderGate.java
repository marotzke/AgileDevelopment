package agile.model.test;

import org.junit.Assert;
import org.junit.Test;

import agile.model.AndGate;
import agile.model.InputPin;
import agile.model.Switch;

public class HalfAdderGate {
	
	@Test
	public void halfAdderGateBothLow(){
		Switch s = new Switch();
		Switch s1 = new Switch();
		HalfAdder half = new HalfAdder();
		
		InputPin pinA = half.getInputPin(0);
		InputPin pinB = half.getInputPin(1);
		
		s.setSignalLow();
		pinA.setSource(s);
		s1.setSignalLow();
		pinB.setSource(s1);
		
		half.setPin(pinA, pinB);
		
		
		Assert.assertFalse(half.getOutputValue(0));
		Assert.assertFalse(half.getOutputValue(1));
		
	}
	
	@Test
	public void halfAdderGateBothHigh(){
		Switch s = new Switch();
		Switch s1 = new Switch();
		HalfAdder half = new HalfAdder();
		
		InputPin pinA = half.getInputPin(0);
		InputPin pinB = half.getInputPin(1);
		
		s.setSignalHigh();
		pinA.setSource(s);
		s1.setSignalHigh();
		pinB.setSource(s1);
		
		half.setPin(pinA, pinB);
		
		
		Assert.assertFalse(half.getOutputValue(0));
		Assert.assertTrue(half.getOutputValue(1));
		
	}
	
	@Test
	public void halfAdderGate01(){
		Switch s = new Switch();
		Switch s1 = new Switch();
		HalfAdder half = new HalfAdder();
		
		InputPin pinA = half.getInputPin(0);
		InputPin pinB = half.getInputPin(1);
		
		s.setSignalLow();
		pinA.setSource(s);
		s1.setSignalHigh();
		pinB.setSource(s1);
		
		half.setPin(pinA, pinB);
		
		
		Assert.assertTrue(half.getOutputValue(0));
		Assert.assertFalse(half.getOutputValue(1));
		
	}
	
	@Test
	public void halfAdderGate10(){
		Switch s = new Switch();
		Switch s1 = new Switch();
		HalfAdder half = new HalfAdder();
		
		InputPin pinA = half.getInputPin(0);
		InputPin pinB = half.getInputPin(1);
		
		s.setSignalHigh();
		pinA.setSource(s);
		s1.setSignalLow();
		pinB.setSource(s1);
		
		half.setPin(pinA, pinB);
		
		
		Assert.assertTrue(half.getOutputValue(0));
		Assert.assertFalse(half.getOutputValue(1));
		
	}
}
