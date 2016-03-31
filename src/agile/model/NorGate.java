package agile.model;

public class NorGate extends LogicGate {
	
	private InputPin pinA;
	private InputPin pinB;
	
	
	public void setPin(InputPin pinA, InputPin pinB){
		this.pinA = pinA;
		this.pinB = pinB;
	}
	
	public boolean getOutputValue(int index){
		OrGate or = new OrGate();
		NotGate not = new NotGate();
		
		or.setPin(pinA, pinB);

		InputPin pin = new InputPin(0);
		pin.setSource(or);
		
		not.setPin(pin);
		
		
		return not.getOutputValue(0);
	}

}
