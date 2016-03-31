package agile.model.test;

import org.junit.Assert;
import org.junit.Test;

import agile.model.AndGate;
import agile.model.InputPin;
import agile.model.Switch;

public class FullAdderGate {
		
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
}
