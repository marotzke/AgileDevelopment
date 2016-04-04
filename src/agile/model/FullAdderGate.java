package agile.model;

public class FullAdderGate extends LogicGate {
	
	private InputPin pinA;
	private InputPin pinB;
	private InputPin pinC;
	private HalfAdderGate ha1;
	private HalfAdderGate ha2;
	private OrGate or;
	private InputPin pin1;
	private InputPin pin2;
	private InputPin pin3;
	
	public FullAdderGate(){
		ha1 = new HalfAdderGate();
		ha2 = new HalfAdderGate();
		or = new OrGate();
		
		pin1 = new InputPin(0);
		pin2 = new InputPin(1);
		pin3 = new InputPin(1);
	}
	
	public void setPin(InputPin pinA, InputPin pinB, InputPin pinC){
		this.pinA = pinA;
		this.pinB = pinB;
		this.pinC = pinC;
	}
		
	public boolean getOutputValue(int index){
		ha1.setPin(pinA,pinB);
		
		pin1.setSource(ha1);
		pin2.setSource(ha1);
		
		ha2.setPin(pinC,pin1);
		
		pin3.setSource(ha2);
		
		or.setPin(pin2,pin3);
		
		if (index == 1){
			
			return or.getOutputValue(0);
			
		}
		
		else{
			
			return ha2.getOutputValue(0);
			
		}
		
	}
	
}
