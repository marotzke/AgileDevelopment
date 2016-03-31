package agile.model;

public class XorGate extends LogicGate {

	private InputPin pinA;
	private InputPin pinB;
	
	public void setPin(InputPin pinA, InputPin pinB){
		this.pinA = pinA;
		this.pinB = pinB;	
	}
	
	public boolean getOutputValue(int index){
		NotGate not1 = new NotGate();
		NotGate not2 = new NotGate();
		AndGate and1 = new AndGate();
		AndGate and2 = new AndGate();
		OrGate or = new OrGate();
		
		
		not1.setPin (pinA);
		not2.setPin(pinB);
		
		InputPin pin1 = new InputPin(0);
		InputPin pin2 = new InputPin(0);
		
		pin1.setSource(not1);
		pin2.setSource(not2);
		
		and1.setPin(pinB, pin1);
		and2.setPin(pinA, pin2);
		
		InputPin pin3 = new InputPin(0);
		InputPin pin4 = new InputPin(0);
		
		pin3.setSource(and1);
		pin4.setSource(and2);
		
		or.setPin(pin3, pin4);
		
		return or.getOutputValue(0);
		
	}
	
}
