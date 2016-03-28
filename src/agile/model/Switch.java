package agile.model;

public class Switch implements Source{
	private boolean signal;
	
	public void toggle(){
		signal = !signal;
	}
	
	@Override
	public boolean getOutputValue(int index) {
		// TODO Auto-generated method stub
		return false;
	}

}
