package agile.vision;

import java.awt.Graphics;

import javax.swing.JCheckBox;

import agile.model.Source;

public class GateDrawer implements Gate{
	
	protected String gateName;
		
	protected int switchSizeH;
	protected int switchSizeW;
	
	protected int size;
	protected int locationX;
	protected int locationY;
	
	protected JCheckBox switch1;
	protected JCheckBox switch2;
	protected JCheckBox switch3;
	protected JCheckBox lampA;
	protected JCheckBox lampB;
	
	public void setSwitches(JCheckBox switch1, JCheckBox switch2,JCheckBox switch3, JCheckBox lampA, JCheckBox lampB) {
		this.switch1 = switch1;
		this.switch2 = switch2;
		this.switch3 = switch3;
		this.lampA = lampA;
		this.lampB = lampB;
		this.switchSizeW = 40;
		this.switchSizeH = 20;
	}
	
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
	
	public void drawGround(Graphics g){
		//c ground
		g.drawLine(locationX+size*2, locationY+size*14, locationX+size*5, locationY+size*14);		
		g.drawLine(locationX+size*5, locationY+size*14, locationX+size*5, locationY+size*16);
		g.drawLine(locationX+size*3, locationY+size*16, locationX+size*7, locationY+size*16);
		g.drawLine(locationX+size*4, locationY+10+size*16, locationX+size*6, locationY+10+size*16);
		g.drawLine(locationX+10+size*4, locationY+20+size*16, locationX-10+size*6, locationY+20+size*16);
		
	}
	
	public void drawGroundCarry(Graphics g){
		//carry ground
		g.drawLine(locationX+size*19,locationY+size*10,locationX+size*22,locationY+size*10);
		g.drawLine(locationX+size*19,locationY+size*10,locationX+size*19,locationY+size*16);
		g.drawLine(locationX+size*17, locationY+size*16, locationX+size*21, locationY+size*16);
		g.drawLine(locationX+size*18, locationY+10+size*16, locationX+size*20, locationY+10+size*16);
		g.drawLine(locationX+10+size*18, locationY+20+size*16, locationX-10+size*20, locationY+20+size*16);
	}
	
	public boolean calculateOutputValue(Source sa,Source sb,Source sc, int index){
		return false;
	}

}
