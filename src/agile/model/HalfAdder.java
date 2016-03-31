package agile.model;

public class HalfAdder extends LogicGate{
	
	private InputPin pinA;
	private InputPin pinB;
	
	public void setPin(InputPin pinA, InputPin pinB){
		this.pinA = pinA;
		this.pinB = pinB;	
	}
	
	public boolean getOutputValue(int index){
		
		AndGate and = new AndGate();
		XnorGate xnor = new XnorGate();
		
		and.setPin(pinA, pinB);
		xnor.setPin(pinA,pinB);
		
		if (index == 0) {
			return xnor.getOutputValue(0);
		}
		
		else {
			return and.getOutputValue(1);
		}
		
	}
	

}
