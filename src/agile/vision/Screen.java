package agile.vision;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Screen extends JPanel{
	
	//Implement the GUI using Swing
	
	private static final long serialVersionUID = 1L;
				
	private int width;
	private int height;
	
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
	
	private static GateDrawer[] gates = {AND,OR};
	public static Graphics g;
	
	/*private String[] logicGateStrings = {"AND","NAND","NEG-AND",
			"OR","NOR","XOR","XNOR","NEG-OR",
			"NOT","HALF-ADDER","FULLADDER"};*/
	static private String gate = "None";
	
	public Screen(){
		this.width  = 500;
		this.height = 500;
		
		setPreferredSize(new Dimension(this.width, this.height));
		
		AND = new AndGateDrawer();
		OR = new OrGateDrawer();
		//gates = {(AndGateDrawer) AND, (OrGateDrawer) OR};
		
	}
	
	public void paintComponent(Graphics g) {
		
		getToolkit().sync();
	}
	
	public void setupScreen(Screen screen){
        JFrame frame = new JFrame("LogicGate Program");
        
        JComboBox<GateDrawer> logicGates = new JComboBox<GateDrawer>(gates);        
        logicGates.setSelectedIndex(0);
		screen.setLayout(new FlowLayout());
		screen.add(logicGates);
		
		logicGates.addActionListener(new ActionListener() {
			 
		    @Override
		    public void actionPerformed(ActionEvent event) {
				JComboBox<String> combo = (JComboBox<String>) event.getSource();
		        gate = (String) combo.getSelectedItem();
		        }
		});        
		
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.setContentPane(screen);
        frame.pack();
        frame.setVisible(true);
        }

}
