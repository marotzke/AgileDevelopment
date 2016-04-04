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
	

    private JCheckBox switchA;
    private JCheckBox switchB;
    private JCheckBox switchC;
    private JCheckBox lampA;
    private JCheckBox lampB;
	
	private Switch sa;
	private Switch sb;
	private Switch sc;
	
	private JFrame frame;
	
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
	private static MuxGateDrawer MUX;
	private static GateDrawer select;

	static protected GateDrawer gate;
	
	public Screen(){
		this.locationX = -30;
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
		MUX = new MuxGateDrawer();
		select = new GateDrawer();
		
	}
	
	public void paintComponent(Graphics g) {
		getToolkit().sync();
	}
	
	
	public void setupScreen(Screen screen){
		
        frame = new JFrame("LogicGate Program");
        
        switchA = new JCheckBox("A");
        switchB = new JCheckBox("B");
        switchC = new JCheckBox("C");
        lampA = new JCheckBox("Out");
        lampB = new JCheckBox("Carry");
        
        JComboBox<GateDrawer> logicGates = new JComboBox<GateDrawer>();
        
        logicGates.addItem(select);
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
        logicGates.addItem(MUX);
        
		switchA.setBounds(locationX+30,locationY+size*4, 40, 20);
		switchB.setBounds(locationX+30,locationY+size*9, 40, 20);
		switchC.setBounds(locationX+30,locationY+size*13, 40, 20);
		lampA.setBounds(locationX+size*19,locationY+size*6, 60, 20);
		lampB.setBounds(locationX+size*19,locationY+size*9, 70, 20);
		lampA.setEnabled(false);
		lampB.setEnabled(false);
		
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
		logicGates.setBounds(350 + insets.left, 5 + insets.top, pSize.width, pSize.height);

		switchA.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				lampA.setEnabled(true);
				lampB.setEnabled(true);
				boolean a = switchA.isSelected();
				boolean b = switchB.isSelected();
				boolean c = switchC.isSelected();
				sa.setSignal(a);
				sb.setSignal(b);
				sc.setSignal(c);
				lampA.setSelected(gate.calculateOutputValue(sa, sb, sc, 0));
				lampB.setSelected(gate.calculateOutputValue(sa, sb, sc, 1));
				lampA.setEnabled(false);
				lampB.setEnabled(false);
			}
		});
		
		switchB.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				lampA.setEnabled(true);
				lampB.setEnabled(true);
				boolean a = switchA.isSelected();
				boolean b = switchB.isSelected();
				boolean c = switchC.isSelected();
				sa.setSignal(a);
				sb.setSignal(b);
				sc.setSignal(c);
				lampA.setSelected(gate.calculateOutputValue(sa, sb, sc, 0));
				lampB.setSelected(gate.calculateOutputValue(sa, sb, sc, 1));
				lampA.setEnabled(false);
				lampB.setEnabled(false);
			}
		});
		
		switchC.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				lampA.setEnabled(true);
				lampB.setEnabled(true);
				boolean a = switchA.isSelected();
				boolean b = switchB.isSelected();
				boolean c = switchC.isSelected();
				sa.setSignal(a);
				sb.setSignal(b);
				sc.setSignal(c);
				lampA.setSelected(gate.calculateOutputValue(sa, sb, sc, 0));
				lampB.setSelected(gate.calculateOutputValue(sa, sb, sc, 1));
				lampA.setEnabled(false);
				lampB.setEnabled(false);
			}
		});
		
		logicGates.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent event) {
		    	Graphics g = getGraphics();
				JComboBox<GateDrawer> tmp = (JComboBox<GateDrawer>) event.getSource();
		        gate = (GateDrawer) tmp.getSelectedItem();
		        
				//Action Starter
				lampA.setEnabled(true);
				lampB.setEnabled(true);
				lampA.setSelected(gate.calculateOutputValue(sa, sb, sc, 0));
				lampB.setSelected(gate.calculateOutputValue(sa, sb, sc, 1));
				lampA.setEnabled(false);
				lampB.setEnabled(false);
				
		        System.out.println(gate);
		        gate.setSize(size);
		        gate.setLocationX(locationX);
		        gate.setLocationY(locationY);
		        gate.setSwitches(switchA, switchB, switchC, lampA, lampB);
				g.clearRect(locationX+70, locationY, locationX+size*20, frame.getHeight());
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
