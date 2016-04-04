package agile.model;

public class XnorGate extends LogicGate {
	
	private InputPin pinA;
	private InputPin pinB;
	private XorGate xor;
	private NotGate not;
	private InputPin pin;
	
	public XnorGate(){
		
		xor = new XorGate();
		not = new NotGate();
		
		pin = new InputPin(0);
	}
	
	public void setPin(InputPin pinA, InputPin pinB){
		this.pinA = pinA;
		this.pinB = pinB;	
	}
	
	public boolean getOutputValue(int index){
		
		xor.setPin(pinA, pinB);
		
		pin.setSource(xor);
		
		not.setPin(pin);
		
		return not.getOutputValue(0);
		
		
	}
}
