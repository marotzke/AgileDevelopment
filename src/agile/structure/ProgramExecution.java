package agile.structure;

import agile.vision.*;
//import agile.model.*;

public class ProgramExecution {

	static Screen screen;
	public static void main(String[] args){
		screen = new Screen();
		screen.setupScreen(screen);
	}
}
