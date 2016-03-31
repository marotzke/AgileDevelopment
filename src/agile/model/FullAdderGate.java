package agile.model;

public class FullAdderGate extends LogicGate {
	
	private InputPin pinA;
	private InputPin pinB;
	private InputPin pinC;
	
	public void setPin(InputPin pinA, InputPin pinB, InputPin pinC){
		this.pinA = pinA;
		this.pinB = pinB;
		this.pinC = pinC;
	}
		
	public boolean getOutputValue(int index){
		
		HalfAdderGate ha1 = new HalfAdderGate();
		HalfAdderGate ha2 = new HalfAdderGate();
		OrGate or = new OrGate();
		
		ha1.setPin(pinA,pinB);
		
		InputPin pin1 = new InputPin(0);
		InputPin pin3 = new InputPin(1);
		
		pin1.setSource(ha1);
		pin3.setSource(ha1);
		
		ha2.setPin(pin1,pinC);
		
		InputPin pin2 = new InputPin(1);
		
		pin2.setSource(ha2);
		
		or.setPin(pin2,pin3);
		
		if (index == 1){
			
			return or.getOutputValue(1);
			
		}
		
		else{
			
			return or.getOutputValue(0);
			
		}
		
		
		
		
	}
	
}
