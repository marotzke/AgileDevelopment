package agile.model;

public class HalfAdderGate extends LogicGate{
	
	private InputPin pinA;
	private InputPin pinB;
	private AndGate and;
	private XorGate xor;
	
	public HalfAdderGate(){
		and = new AndGate();
		xor = new XorGate();
	}
	
	public void setPin(InputPin pinA, InputPin pinB){
		this.pinA = pinA;
		this.pinB = pinB;	
	}
	
	public boolean getOutputValue(int index){
		
		and.setPin(pinA, pinB);
		xor.setPin(pinA,pinB);
		
		if (index == 0) {
			return xor.getOutputValue(0);
		}
		
		else {
			return and.getOutputValue(1);
		}
		
	}
	

}
