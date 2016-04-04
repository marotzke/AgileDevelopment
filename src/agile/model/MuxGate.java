package agile.model;

public class MuxGate extends LogicGate{
	private InputPin pinA;
	private InputPin pinB;
	private InputPin pinC;
	private AndGate and;
	private AndGate and2;
	private OrGate or;
	private NotGate not;
	private InputPin pin1;
	private InputPin pin2;
	private InputPin pin3;
	
	public MuxGate(){
		and = new AndGate();
		and2 = new AndGate();
		or = new OrGate();
		not = new NotGate();
		pin1 = new InputPin(0);
		pin2 = new InputPin(0);
		pin3 = new InputPin(0);
		
	}
	
	public void setPin(InputPin pinA, InputPin pinB, InputPin pinC){
		this.pinA = pinA;
		this.pinB = pinB;	
		this.pinC = pinC;
	}
	
	public boolean getOutputValue(int index){
		
		not.setPin(pinC);
		pin1.setSource(not);
		
		and.setPin(pinA, pin1);
		and2.setPin(pinB, pinC);
		
		pin2.setSource(and);
		pin3.setSource(and2);
		
		or.setPin(pin2,pin3);

		return or.getOutputValue(0);
		
	}
}
