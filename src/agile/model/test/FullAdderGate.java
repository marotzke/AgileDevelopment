package agile.model.test;

import org.junit.Assert;
import org.junit.Test;

import agile.model.FullAdderGate;
import agile.model.InputPin;
import agile.model.Switch;

public class FullAdderGateTest {
		
	@Test
	public void fullAdder000(){
		Switch s = new Switch();
		Switch s1 = new Switch();
		Switch s2 = new Switch();
		FullAdder full = new FullAdder();
		
		InputPin pinA = full.getInputPin(0);
		InputPin pinB = full.getInputPin(1);
		
		s.setSignalLow();
		pinA.setSource(s);
		s1.setSignalLow();
		pinB.setSource(s1);
		s2.setSignalLow();
		pinB.setSource(s2);
		
		full.setPin(pinA, pinB);
		
		
		Assert.assertFalse(full.getOutputValue(0));
		Assert.assertFalse(full.getOutputValue(1));
		
	}
	
	@Test
	public void fullAdderGate001(){
		Switch s = new Switch();
		Switch s1 = new Switch();
		Switch s2 = new Switch();
		FullAdder full = new FullAdder();
		
		InputPin pinA = full.getInputPin(0);
		InputPin pinB = full.getInputPin(1);
		
		s.setSignalLow();
		pinA.setSource(s);
		s1.setSignalLow();
		pinB.setSource(s1);
		s2.setSignalHigh();
		pinB.setSource(s2);
		
		full.setPin(pinA, pinB);
		
		
		Assert.assertFalse(full.getOutputValue(0));
		Assert.assertTrue(full.getOutputValue(1));
		
	}
	
	@Test
	public void fullAdderGate010(){
		Switch s = new Switch();
		Switch s1 = new Switch();
		Switch s2 = new Switch();
		FullAdder full = new FullAdder();
		
		InputPin pinA = full.getInputPin(0);
		InputPin pinB = full.getInputPin(1);
		
		s.setSignalLow();
		pinA.setSource(s);
		s1.setSignalHigh();
		pinB.setSource(s1);
		s2.setSignalLow();
		pinB.setSource(s2);
		
		full.setPin(pinA, pinB);
		
		
		Assert.assertFalse(full.getOutputValue(0));
		Assert.assertFalse(full.getOutputValue(1));
		
	}
	
	@Test
	public void fullAdderGate100(){
		Switch s = new Switch();
		Switch s1 = new Switch();
		Switch s2 = new Switch();
		FullAdder full = new FullAdder();
		
		InputPin pinA = full.getInputPin(0);
		InputPin pinB = full.getInputPin(1);
		
		s.setSignalHigh();
		pinA.setSource(s);
		s1.setSignalLow();
		pinB.setSource(s1);
		s2.setSignalLow();
		pinB.setSource(s2);
		
		full.setPin(pinA, pinB);
		
		
		Assert.assertFalse(full.getOutputValue(0));
		Assert.assertTrue(full.getOutputValue(1));
		
	}
	
	@Test
	public void fullAdderGate011(){
		Switch s = new Switch();
		Switch s1 = new Switch();
		Switch s2 = new Switch();
		FullAdder full = new FullAdder();
		
		InputPin pinA = full.getInputPin(0);
		InputPin pinB = full.getInputPin(1);
		
		s.setSignalLow();
		pinA.setSource(s);
		s1.setSignalHigh();
		pinB.setSource(s1);
		s2.setSignalHigh();
		pinB.setSource(s2);
		
		full.setPin(pinA, pinB);
		
		
		Assert.assertTrue(full.getOutputValue(0));
		Assert.assertFalse(full.getOutputValue(1));
		
	}
	
	@Test
	public void fullAdderGate110(){
		Switch s = new Switch();
		Switch s1 = new Switch();
		Switch s2 = new Switch();
		FullAdder full = new FullAdder();
		
		InputPin pinA = full.getInputPin(0);
		InputPin pinB = full.getInputPin(1);
		
		s.setSignalHigh();
		pinA.setSource(s);
		s1.setSignalHigh();
		pinB.setSource(s1);
		s2.setSignalLow();
		pinB.setSource(s2);
		
		full.setPin(pinA, pinB);
		
		
		Assert.assertTrue(full.getOutputValue(0));
		Assert.assertFalse(full.getOutputValue(1));
		
	}
	
	@Test
	public void fullAdderGate101(){
		Switch s = new Switch();
		Switch s1 = new Switch();
		Switch s2 = new Switch();
		FullAdder full = new FullAdder();
		
		InputPin pinA = full.getInputPin(0);
		InputPin pinB = full.getInputPin(1);
		
		s.setSignalHigh();
		pinA.setSource(s);
		s1.setSignalLow();
		pinB.setSource(s1);
		s2.setSignalHigh();
		pinB.setSource(s2);
		
		full.setPin(pinA, pinB);
		
		
		Assert.assertTrue(full.getOutputValue(0));
		Assert.assertFalse(full.getOutputValue(1));
		
	}
	
	@Test
	public void fullAdderGate111(){
		Switch s = new Switch();
		Switch s1 = new Switch();
		Switch s2 = new Switch();
		FullAdder full = new FullAdder();
		
		InputPin pinA = full.getInputPin(0);
		InputPin pinB = full.getInputPin(1);
		
		s.setSignalHigh();
		pinA.setSource(s);
		s1.setSignalHigh();
		pinB.setSource(s1);
		s2.setSignalHigh();
		pinB.setSource(s2);
		
		full.setPin(pinA, pinB);
		
		
		Assert.assertTrue(full.getOutputValue(0));
		Assert.assertTrue(full.getOutputValue(1));
		
	}
	
}
