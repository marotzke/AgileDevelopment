package agile.model;

public class XnorGate extends LogicGate {
	
	private InputPin pinA;
	private InputPin pinB;
	
	public void setPin(InputPin pinA, InputPin pinB){
		this.pinA = pinA;
		this.pinB = pinB;	
	}
	
	public boolean getOutputValue(int index){
		
		XorGate xor = new XorGate();
		NotGate not = new NotGate();
		
		xor.setPin(pinA, pinB);
		
		InputPin pin = new InputPin(0);
		
		pin.setSource(xor);
		
		not.setPin(pin);
		
		return not.getOutputValue(0);
		
		
	}
}
