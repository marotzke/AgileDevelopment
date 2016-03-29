package agile.structure;

import javax.swing.JFrame;

import agile.vision.*;
//import agile.model.*;

public class Main {
	static Screen screen;
	public static void main(String[] args){
		screen = new Screen();
        JFrame frame = new JFrame("LogicGate Program");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setContentPane(screen);
        frame.pack();
        frame.setVisible(true);
	}
}
