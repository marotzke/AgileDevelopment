package agile.vision;

import java.awt.Graphics;

public class GateDrawer implements Gate{
	
	protected String gateName;
	
	protected int size;
	protected int locationX;
	protected int locationY;
	
	public void setSize(int size) {
		this.size = size;	
	}
	
	public void setLocationX(int locationX) {
		this.locationX = locationX;	
	}
	
	public void setLocationY(int locationY) {
		this.locationY = locationY;	
	}
	
	@Override
	public String toString(){
		return gateName;
	}
	
	public void drawGate(Graphics g){
		
	}
}
