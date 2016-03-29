package agile.model;

public class Switch implements Source{
	private boolean signal;
	
	public void setSignalHigh(){
		signal = true;
	}
	
	public void setSignalLow(){
		signal = false;
	}
	
	@Override
	public boolean getOutputValue(int index) {
		return signal;
	}
}
