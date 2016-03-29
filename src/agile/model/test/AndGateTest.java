package agile.model.test;

import agile.model.*;
import org.junit.Assert;
import org.junit.Test;

public class AndGateTest {
	
	public void andGateBothLow(){
		Switch s = new Switch();
		AndGate and = new AndGate();
		
		Assert.assertFalse(and.getOutputValue(0));
		
	}
}
