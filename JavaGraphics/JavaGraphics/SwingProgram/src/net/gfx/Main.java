package net.gfx;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Polygon;
import java.awt.SystemColor;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Path;
import java.sql.Time;
import java.util.TimeZone;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

import org.apache.logging.log4j.core.config.builder.impl.BuiltConfiguration;
import org.apache.logging.log4j.core.util.SystemClock;

public class Main {
public static Image img;
public static ImageObserver observer;
private static KeyEvent Event;
private static Polygon p;
private static String str1;
private static String str2;

public static Path path ;
	public static void main(String[] args)   {
		// TODO Auto-generated method stub
		
		
javax.swing.JFrame frame = new JFrame("Undefined");
javax.swing.JPanel panel = new JPanel();

java.awt.Canvas canvas = new Canvas();
frame.setSize(640, 480);
frame.setVisible(true);

frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
frame.setResizable(false);

frame.add(panel);
panel.setVisible(true);

panel.setSize(640, 480);


File text = new File("G:\\FamiTracker-v0.4.6\\Demo\\music.asm");
try {
	str1 = net.gfx.TextReader.Read(text);
	
	org.apache.logging.log4j.LogManager.getLogger().debug(str1);

	
} catch (IOException e1) {
	// TODO Auto-generated catch block
	org.apache.logging.log4j.LogManager.getLogger().fatal("A Fatal Error Has Occurred:" + "" + e1);
	System.exit(-1);
}
net.gfx.Test t = new net.gfx.Test();



try {
	panel.getGraphics().drawImage(ImageIO.read(t.readFromInputStream(text)), 4, 3, 32, 32, observer);
} catch (IOException e) {
	// TODO Auto-generated catch block
	org.apache.logging.log4j.LogManager.getLogger().fatal("A Fatal Error Has Occurred:" + "" + e);
	System.exit(-1);
}


panel.getGraphics().drawRect(18, 50, 32, 32);

//panel.getGraphics().fillRect(5, 100, 32, 32);

//check.keyPressed(Event);
	}
	
			
		
	}
	


