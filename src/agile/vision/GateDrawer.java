package agile.vision;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JCheckBox;

import agile.model.Source;

public class GateDrawer implements Gate{
	
	protected String gateName;
		
	protected Dimension switchSize;
	
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
		this.switchSize = switch1.getPreferredSize();
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
	
	public boolean calculateOutputValue(Source sa,Source sb,Source sc){
		return false;
	}

}
