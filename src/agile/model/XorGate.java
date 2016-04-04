package agile.model;

public class XorGate extends LogicGate {

	private InputPin pinA;
	private InputPin pinB;
	private NotGate not1;
	private NotGate not2;
	private AndGate and1;
	private AndGate and2;
	private OrGate or;
	private InputPin pin1;
	private InputPin pin2;
	private InputPin pin3;
	private InputPin pin4;
	
	public XorGate(){
		not1 = new NotGate();
		not2 = new NotGate();
		and1 = new AndGate();
		and2 = new AndGate();
		or = new OrGate();
		
		pin1 = new InputPin(0);
		pin2 = new InputPin(0);
		pin3 = new InputPin(0);
		pin4 = new InputPin(0);
	}
	
	public void setPin(InputPin pinA, InputPin pinB){
		this.pinA = pinA;
		this.pinB = pinB;	
	}
	
	public boolean getOutputValue(int index){
				
		not1.setPin (pinA);
		not2.setPin(pinB);
		
		pin1.setSource(not1);
		pin2.setSource(not2);
		
		and1.setPin(pinB, pin1);
		and2.setPin(pinA, pin2);
		
		pin3.setSource(and1);
		pin4.setSource(and2);
		
		or.setPin(pin3, pin4);
		
		return or.getOutputValue(0);
		
	}
	
}
