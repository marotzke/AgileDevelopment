package agile.model;

public class LogicGate implements Source, Drain{

	@Override
	public InputPin getInputPin(int index) {
		InputPin Pin = new InputPin(index);
		return Pin;
	}

	@Override
	public boolean getOutputValue(int index) {
		// TODO Auto-generated method stub
		return false;
	}

}
