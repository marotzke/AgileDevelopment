package agile.model;

public class AndGate extends LogicGate {
	private InputPin pinA;
	private InputPin pinB;
	
	public AndGate(){
		InputPin pinA = new InputPin();
		InputPin pinB = new InputPin();
	}
	
	public boolean getOutputValue(int index) {
		
		boolean sinalA = pinA.getSource().getOutputValue(pinA.getIndex());
		boolean sinalB = pinB.getSource().getOutputValue(pinB.getIndex());
		
		return sinalA && sinalB;
	}
}
