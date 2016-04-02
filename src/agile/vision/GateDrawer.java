package agile.vision;

import java.awt.Graphics;

public class GateDrawer implements Gate{
	
	protected String gateName;
	protected int size = 5;
	
	@Override
	public String toString(){
		return this.gateName;
	}
	
	public void drawGate(Graphics g){
		
	}
}
