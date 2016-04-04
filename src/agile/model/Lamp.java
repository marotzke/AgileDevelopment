package agile.model;

public class Lamp implements Drain{
	
	private InputPin pin;
	
	public Lamp(int index){
		pin = new InputPin(index);
	}
	
	@Override
	public InputPin getInputPin(int index) {
		return pin;
	}
	
	public void setPinLampSource(Source source){
		pin.setSource(source);
	}
	
	public boolean isOn(){
		return pin.getSource().getOutputValue(pin.getIndex());
	}

}
