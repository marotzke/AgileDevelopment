package agile.vision;

import java.awt.Graphics;

import agile.model.Source;

public interface Gate {
	public void drawGate(Graphics g);

	boolean calculateOutputValue(Source sa, Source sb, Source sc, int index);
}
