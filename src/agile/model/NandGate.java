package agile.model;

public class NandGate extends LogicGate{
	private InputPin pinA;
	private InputPin pinB;
	
	
	public void setPin(InputPin pinA, InputPin pinB){
		this.pinA = pinA;
		this.pinB = pinB;
	}
	
	public boolean getOutputValue(int index){
		AndGate and = new AndGate();
		NotGate not = new NotGate();
		
		and.setPin(pinA, pinB);

		InputPin pin = new InputPin(0);
		pin.setSource(and);
		
		not.setPin(pin);
		
		
		return not.getOutputValue(0);
	}

}
