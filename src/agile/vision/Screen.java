package agile.vision;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import agile.model.*;
import javax.swing.*;


public class Screen extends JPanel{
	
	//Implement the GUI using Swing
	
	private static final long serialVersionUID = 1L;
				
	private int width;
	private int height;

	protected int locationX;
	protected int locationY;
	protected int size;
	

    JCheckBox switchA;
    JCheckBox switchB;
    JCheckBox switchC;
    JCheckBox lampA;
    JCheckBox lampB;
	
	private Switch sa;
	private Switch sb;
	private Switch sc;
	
	JFrame frame;
	
	private static AndGateDrawer AND;
	private static OrGateDrawer OR;
	private static NotGateDrawer NOT;
	private static HalfAdderGateDrawer HA;
	private static FullAdderGateDrawer FA;
	private static XorGateDrawer XOR;
	private static XnorGateDrawer XNOR;
	private static NegAndGateDrawer NEGAND;
	private static NegOrGateDrawer NEGOR;
	private static NorGateDrawer NOR;
	private static NandGateDrawer NAND;

	static protected GateDrawer gate;
	
	public Screen(){
		this.locationX = 0;
		this.locationY = 100;
		this.size = 20;
		this.width  = 500;
		this.height = 500;
		
		sa = new Switch();
		sb = new Switch();
		sc = new Switch();
		
		setPreferredSize(new Dimension(this.width, this.height));
		
		AND = new AndGateDrawer();
		OR = new OrGateDrawer();
		NAND = new NandGateDrawer();
		NOR = new NorGateDrawer();
		NOT = new NotGateDrawer();
		XNOR = new XnorGateDrawer();
		XOR = new XorGateDrawer();
		NEGAND = new NegAndGateDrawer();
		NEGOR = new NegOrGateDrawer();
		HA = new HalfAdderGateDrawer();
		FA = new FullAdderGateDrawer();
		
	}
	
	public void paintComponent(Graphics g) {
		getToolkit().sync();
	}
	
	
	public void setupScreen(Screen screen){
		
        frame = new JFrame("LogicGate Program");
        
        switchA = new JCheckBox("A");
        switchB = new JCheckBox("B");
        switchC = new JCheckBox("C");
        lampA = new JCheckBox("O");
        lampB = new JCheckBox("Carry");
        
        JComboBox<GateDrawer> logicGates = new JComboBox<GateDrawer>();
        
        logicGates.addItem(NOT);
        logicGates.addItem(AND);
        logicGates.addItem(NAND);
        logicGates.addItem(NEGAND);
        logicGates.addItem(OR);
        logicGates.addItem(XOR);
        logicGates.addItem(NOR);
        logicGates.addItem(XNOR);
        logicGates.addItem(NEGOR);
        logicGates.addItem(HA);
        logicGates.addItem(FA);
        
		switchA.setBounds(locationX,locationY+size*4, 40, 20);
		switchB.setBounds(locationX,locationY+size*9, 40, 20);
		switchC.setBounds(locationX,locationY+size*13, 40, 20);
		lampA.setBounds(locationX+size*22,locationY+size*6, 40, 20);
		lampB.setBounds(locationX+size*22,locationY+size*9, 70, 20);
		
		screen.add(switchA);
		screen.add(switchB);
		screen.add(switchC);
		screen.add(lampA);
		screen.add(lampB);
		
        logicGates.setSelectedIndex(0);
		screen.setLayout(null);
		screen.add(logicGates);
		

		Insets insets = screen.getInsets();
		Dimension pSize = logicGates.getPreferredSize();
		logicGates.setBounds(350 + insets.left, 5 + insets.top,
	             pSize.width, pSize.height);

		switchA.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				boolean a = switchA.isSelected();
				boolean b = switchB.isSelected();
				boolean c = switchC.isSelected();
				sa.setSignal(a);
				sb.setSignal(b);
				sc.setSignal(c);
				lampA.setSelected(gate.calculateOutputValue(sa, sb, sc, 0));
				lampB.setSelected(gate.calculateOutputValue(sa, sb, sc, 1));
			}
		});
		
		switchB.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				boolean a = switchA.isSelected();
				boolean b = switchB.isSelected();
				boolean c = switchC.isSelected();
				sa.setSignal(a);
				sb.setSignal(b);
				sc.setSignal(c);
				lampA.setSelected(gate.calculateOutputValue(sa, sb, sc, 0));
				lampB.setSelected(gate.calculateOutputValue(sa, sb, sc, 1));
			}
		});
		
		switchC.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				boolean a = switchA.isSelected();
				boolean b = switchB.isSelected();
				boolean c = switchC.isSelected();
				sa.setSignal(a);
				sb.setSignal(b);
				sc.setSignal(c);
				lampA.setSelected(gate.calculateOutputValue(sa, sb, sc, 0));
				lampB.setSelected(gate.calculateOutputValue(sa, sb, sc, 1));
			}
		});
		
		logicGates.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent event) {
		    	Graphics g = getGraphics();
				JComboBox<GateDrawer> tmp = (JComboBox<GateDrawer>) event.getSource();
		        gate = (GateDrawer) tmp.getSelectedItem();
		        System.out.println(gate);
		        gate.setSize(size);
		        gate.setLocationX(locationX);
		        gate.setLocationY(locationY);
		        gate.setSwitches(switchA, switchB, switchC, lampA, lampB);
				g.clearRect(locationX+40, locationY, locationX+size*20, screen.getHeight());
				gate.drawGate(g);
				getToolkit().sync();
		        }
		});        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setContentPane(screen); 
        frame.pack();
        frame.setVisible(true);
        }

}
