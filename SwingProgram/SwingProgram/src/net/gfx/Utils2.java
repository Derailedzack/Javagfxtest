package net.gfx;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import java.awt.*;

public class Utils2 extends JPanel  {
	public static javax.swing.JFrame frame = new JFrame("test");
	public static javax.swing.JTextArea area = new JTextArea();
	protected void GuiInit() throws IOException {
		//Setup The UI
		net.gfx.Utils te = new net.gfx.Utils();
		JScrollPane pane = new JScrollPane(area);
		//pane.setViewportView();
		//laby.setLocation(-10,-2);
	//GridLayout grid = new GridLayout(2,-40000,-299,-299);
		frame.add(pane);
	    //frame.setLayout(grid);
		frame.setVisible(true);
		frame.setSize(640, 480);
		//labx.setVisible(v);
		//frame.add(labx);
		//frame.add(area);
		
		//pane.add(area);
		pane.setVisible(true);
		pane.setHorizontalScrollBarPolicy(pane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		pane.setVerticalScrollBarPolicy(pane.VERTICAL_SCROLLBAR_AS_NEEDED);
		area.setEditable(false);
		area.setWrapStyleWord(true);
		area.setText(Files.readAllBytes(new File("G:/TestGame/Error.log").toPath()).toString());
	}	
}
