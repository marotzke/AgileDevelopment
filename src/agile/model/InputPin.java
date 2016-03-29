package agile.model;

public class InputPin {
	
	Source source;
	int index;
	
	public InputPin(int index) {
		this.index = index;
	}

	public void setSource(Source source){
		this.source = source;
	}
	
	public int getIndex() {
		return index;
	}

	public Source getSource() {
		return source;
	}
	
	
}
