package agile.model;

public class NorGate extends LogicGate {
	
	private InputPin pinA;
	private InputPin pinB;
	private OrGate or;
	private NotGate not;
	private InputPin pin;
	
	public NorGate(){
		or = new OrGate();
		not = new NotGate();
		
		pin = new InputPin(0);
	}
	
	public void setPin(InputPin pinA, InputPin pinB){
		this.pinA = pinA;
		this.pinB = pinB;
	}
	
	public boolean getOutputValue(int index){
		
		or.setPin(pinA, pinB);
		
		pin.setSource(or);
		
		not.setPin(pin);
		
		
		return not.getOutputValue(0);
	}

}
