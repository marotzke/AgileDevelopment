package agile.model;

public class XnorGate {

	private InputPin pinA;
	private InputPin pinB;
	
	public void setPin(InputPin pinA, InputPin pinB){
		this.pinA = pinA;
		this.pinB = pinB;	
	}
	
	public boolean getOutputValue(int index){
		NotGate not1 = new NotGate();
		NotGate not2 = new NotGate();
	}
	
}
