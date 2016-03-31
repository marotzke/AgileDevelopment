package agile.model.test;

import org.junit.Assert;
import org.junit.Test;

import agile.model.NandGate;
import agile.model.InputPin;
import agile.model.Switch;

public class NandGateTest {
	
	@Test
	public void NandGateBothHigh(){
		Switch s = new Switch();
		NandGate nand = new NandGate();
		
		InputPin pinA = nand.getInputPin(0);
		InputPin pinB = nand.getInputPin(1);
		
		s.setSignalHigh();
		pinA.setSource(s);
		pinB.setSource(s);
		
		nand.setPin(pinA, pinB);
		
		
		Assert.assertFalse(nand.getOutputValue(0));
		
	}
	
	@Test
	public void NandGateBothLow(){
		Switch s = new Switch();
		NandGate nand = new NandGate();
		
		InputPin pinA = nand.getInputPin(0);
		InputPin pinB = nand.getInputPin(1);
		
		s.setSignalLow();
		pinA.setSource(s);
		pinB.setSource(s);
		
		nand.setPin(pinA, pinB);
		
		
		Assert.assertTrue(nand.getOutputValue(0));
		
	}
	
	@Test
	public void NandGateDiferentInput(){
		Switch s = new Switch();
		Switch s1 = new Switch();
		NandGate nand = new NandGate();
		
		InputPin pinA = nand.getInputPin(0);
		InputPin pinB = nand.getInputPin(1);
		
		s.setSignalLow();
		pinA.setSource(s);
		s1.setSignalHigh();
		pinB.setSource(s1);
		
		nand.setPin(pinA, pinB);
		
		
		Assert.assertTrue(nand.getOutputValue(0));
		
	}
}
