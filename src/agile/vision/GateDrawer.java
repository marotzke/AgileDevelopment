package agile.vision;

import java.awt.Graphics;

public class GateDrawer implements Gate{
	
	protected String gateName;
	
	protected int size;
	
	public void setSize(int size) {
		this.size = size;	
	}
	
	@Override
	public String toString(){
		return gateName;
	}
	
	public void drawGate(Graphics g){
		
	}
}
