package agile.model;

public class NegAndGate extends LogicGate {
	
	private InputPin pinA;
	private InputPin pinB;
	
	public void setPin(InputPin pinA, InputPin pinB){
		this.pinA = pinA;
		this.pinB = pinB;
	}
		
	public boolean getOutputValue(int index) {
		
		AndGate and = new AndGate();
		NotGate not1 = new NotGate();
		NotGate not2 = new NotGate();
		
		not1.setPin(pinA);
		not2.setPin(pinB);
		
		InputPin pin1 = new InputPin(0);
		InputPin pin2 = new InputPin(0);
		
		pin1.setSource(not1);
		pin2.setSource(not2);
		
		and.setPin(pin1, pin2);
		
		return and.getOutputValue(0);
	}

}
