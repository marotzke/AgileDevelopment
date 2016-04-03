package agile.model;

public class Switch implements Source{
	private boolean signal;
	
	public void setSignalHigh(){
		signal = true;
	}
	
	public void setSignalLow(){
		signal = false;
	}
	
	public void setSignal(boolean signal){
		this.signal = signal;
	}
	
	@Override
	public boolean getOutputValue(int index) {
		return signal;
	}
}
