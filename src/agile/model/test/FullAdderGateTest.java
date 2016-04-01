package agile.model.test;

import org.junit.Assert;
import org.junit.Test;

import agile.model.FullAdderGate;
import agile.model.InputPin;
import agile.model.Switch;

public class FullAdderGateTest {
		
	@Test
	public void FullAdderGate000(){
		Switch s = new Switch();
		Switch s1 = new Switch();
		Switch s2 = new Switch();
		FullAdderGate full = new FullAdderGate();
		
		InputPin pinA = full.getInputPin(0);
		InputPin pinB = full.getInputPin(1);
		InputPin pinC = full.getInputPin(2);
		
		
		s.setSignalLow();
		pinA.setSource(s);
		s1.setSignalLow();
		pinB.setSource(s1);
		s2.setSignalLow();
		pinC.setSource(s2);
		
		full.setPin(pinA, pinB, pinC);
		
		
		Assert.assertFalse(full.getOutputValue(1));
		Assert.assertFalse(full.getOutputValue(0));
		
	}
	
	@Test
	public void FullAdderGateGate001(){
		Switch s = new Switch();
		Switch s1 = new Switch();
		Switch s2 = new Switch();
		FullAdderGate full = new FullAdderGate();
		
		InputPin pinA = full.getInputPin(0);
		InputPin pinB = full.getInputPin(1);
		InputPin pinC = full.getInputPin(2);
		
		s.setSignalLow();
		pinA.setSource(s);
		s1.setSignalLow();
		pinB.setSource(s1);
		s2.setSignalHigh();
		pinC.setSource(s2);
		
		full.setPin(pinA, pinB, pinC);
		
		
		Assert.assertFalse(full.getOutputValue(1));
		Assert.assertTrue(full.getOutputValue(0));
		
	}
	
	@Test
	public void FullAdderGateGate010(){
		Switch s = new Switch();
		Switch s1 = new Switch();
		Switch s2 = new Switch();
		FullAdderGate full = new FullAdderGate();
		
		InputPin pinA = full.getInputPin(0);
		InputPin pinB = full.getInputPin(1);
		InputPin pinC = full.getInputPin(2);
		
		
		s.setSignalLow();
		pinA.setSource(s);
		s1.setSignalHigh();
		pinB.setSource(s1);
		s2.setSignalLow();
		pinC.setSource(s2);
		
		full.setPin(pinA, pinB, pinC);
		
		
		Assert.assertFalse(full.getOutputValue(1));
		Assert.assertTrue(full.getOutputValue(0));
		
	}
	
	@Test
	public void FullAdderGateGate100(){
		Switch s = new Switch();
		Switch s1 = new Switch();
		Switch s2 = new Switch();
		FullAdderGate full = new FullAdderGate();
		
		InputPin pinA = full.getInputPin(0);
		InputPin pinB = full.getInputPin(1);
		InputPin pinC = full.getInputPin(2);
		
		s.setSignalHigh();
		pinA.setSource(s);
		s1.setSignalLow();
		pinB.setSource(s1);
		s2.setSignalLow();
		pinC.setSource(s2);
		
		full.setPin(pinA, pinB, pinC);
		
		
		Assert.assertFalse(full.getOutputValue(1));
		Assert.assertTrue(full.getOutputValue(0));
		
	}
	
	@Test
	public void FullAdderGateGate011(){
		Switch s = new Switch();
		Switch s1 = new Switch();
		Switch s2 = new Switch();
		FullAdderGate full = new FullAdderGate();
		
		InputPin pinA = full.getInputPin(0);
		InputPin pinB = full.getInputPin(1);
		InputPin pinC = full.getInputPin(2);
		
		s.setSignalLow();
		pinA.setSource(s);
		s1.setSignalHigh();
		pinB.setSource(s1);
		s2.setSignalHigh();
		pinC.setSource(s2);
		
		full.setPin(pinA, pinB, pinC);
		
		
		Assert.assertTrue(full.getOutputValue(1));
		Assert.assertFalse(full.getOutputValue(0));
		
	}
	
	@Test
	public void FullAdderGateGate110(){
		Switch s = new Switch();
		Switch s1 = new Switch();
		Switch s2 = new Switch();
		FullAdderGate full = new FullAdderGate();
		
		InputPin pinA = full.getInputPin(0);
		InputPin pinB = full.getInputPin(1);
		InputPin pinC = full.getInputPin(2);
		
		s.setSignalHigh();
		pinA.setSource(s);
		s1.setSignalHigh();
		pinB.setSource(s1);
		s2.setSignalLow();
		pinC.setSource(s2);
		
		full.setPin(pinA, pinB, pinC);
		
		
		Assert.assertTrue(full.getOutputValue(1));
		Assert.assertFalse(full.getOutputValue(0));
		
	}
	
	@Test
	public void FullAdderGateGate101(){
		Switch s = new Switch();
		Switch s1 = new Switch();
		Switch s2 = new Switch();
		FullAdderGate full = new FullAdderGate();
		
		InputPin pinA = full.getInputPin(0);
		InputPin pinB = full.getInputPin(1);
		InputPin pinC = full.getInputPin(2);
		
		s.setSignalHigh();
		pinA.setSource(s);
		s1.setSignalLow();
		pinB.setSource(s1);
		s2.setSignalHigh();
		pinC.setSource(s2);
		
		full.setPin(pinA, pinB, pinC);
		
		
		Assert.assertTrue(full.getOutputValue(1));
		Assert.assertFalse(full.getOutputValue(0));
		
	}
	
	@Test
	public void FullAdderGateGate111(){
		Switch s = new Switch();
		Switch s1 = new Switch();
		Switch s2 = new Switch();
		FullAdderGate full = new FullAdderGate();
		
		InputPin pinA = full.getInputPin(0);
		InputPin pinB = full.getInputPin(1);
		InputPin pinC = full.getInputPin(2);
		
		s.setSignalHigh();
		pinA.setSource(s);
		s1.setSignalHigh();
		pinB.setSource(s1);
		s2.setSignalHigh();
		pinC.setSource(s2);
		
		full.setPin(pinA, pinB, pinC);
		
		
		Assert.assertTrue(full.getOutputValue(1));
		Assert.assertTrue(full.getOutputValue(0));
		
	}
	
}
