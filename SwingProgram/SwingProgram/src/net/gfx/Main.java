package net.gfx;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Polygon;
import java.awt.SystemColor;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.file.Path;
import java.sql.Time;
import java.util.TimeZone;
import java.util.Random;
import javax.imageio.ImageIO;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

import org.apache.commons.configuration2.ex.ConfigurationException;
import org.apache.logging.log4j.core.config.builder.impl.BuiltConfiguration;
import org.apache.logging.log4j.core.util.SystemClock;


public class Main {
	public static javax.swing.JFrame frame = new JFrame("Undefined");
public static Image img;
public static ImageObserver observer;
private static KeyEvent Event;
private static Polygon p;
private static String str1;
private static String str2;
public static net.gfx.Utils t = new net.gfx.Utils();
public static Path path ;
public static int x;
public static int x2;
public static int y2;
public static int y;
public static javax.swing.JPanel panel = new JPanel();
public static InputStream stream;
public static Boolean gameloop;
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
	
		if(System.getProperty("os.name") == "linux") {
			org.apache.logging.log4j.LogManager.getLogger().fatal("Linux Is Not Supported Beacuse Of File Paths");
			System.exit(0);
		}
		if(System.getProperty("os.name") == "Mac OS ") {
			org.apache.logging.log4j.LogManager.getLogger().fatal("Mac Is Not Supported Beacuse Of File Paths");
			System.exit(0);
		}
		
//javax.swing.JPanel panel = new JPanel();

java.awt.Canvas canvas = new Canvas();
frame.setSize(640, 480);
frame.setVisible(true);

frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
frame.setResizable(false);


frame.add(panel);

panel.setVisible(true);

panel.setSize(640, 480);

File text = new File("G:\\FamiTracker-v0.4.6\\Demo\\FDS.wav");
//URL te2 = t.readFromInputStream(("/res/Untitled32X32.png"));
//te2.openStream();
String[] MusicList = new String[3];
MusicList[0] = "/res/FDS.wav";
MusicList[1] = "/res/FDS2.wav";
MusicList[2] = "/res/test.wav";

//org.apache.logging.log4j.LogManager.getLogger().debug(t.readFromInputStream("G:\\FamiTracker-v0.4.6\\Demo\\FDS.wav").toString());
try {
	stream = net.gfx.Main.class.getResourceAsStream(MusicList[t.RNGgen(3)]);
	t.PlayInputStream(stream, -1);
} catch (LineUnavailableException | IOException | UnsupportedAudioFileException e1) {
	// TODO Auto-generated catch block
	org.apache.logging.log4j.LogManager.getLogger().fatal("A Fatal Error Has Occurred:" + "" + e1);
}

org.apache.logging.log4j.LogManager.getLogger().debug("test");


try {
	net.gfx.Test te = new net.gfx.Test();
	te.test();
	frame.addKeyListener(new net.gfx.KeyCheck());
net.gfx.KeyCheck check = new net.gfx.KeyCheck();

stream = net.gfx.Main.class.getResourceAsStream("/res/Untitled32X32.png");
x = t.RNGgen(255);
y = t.RNGgen(255);
	panel.getGraphics().drawImage(ImageIO.read(stream),x , y, 32, 32, observer);
	panel.getGraphics().drawString("" + "X:" + java.lang.Integer.toString(x) ,33,10);
	
	frame.setFocusable(true);
	gameloop = true;
		
	while(gameloop) {
		
		if(frame.isActive() != false) {
			gameloop = false;
		}
		
		frame.setFocusable(true);
	}


} catch (IOException e) {
	// TODO Auto-generated catch block
	org.apache.logging.log4j.LogManager.getLogger().fatal("A Fatal Error Has Occurred:" + "" + e);
	System.exit(-1);
} catch (ConfigurationException e) {
	// TODO Auto-generated catch block
	org.apache.logging.log4j.LogManager.getLogger().fatal("A Fatal Error Has Occurred:" + "" + e);
	System.exit(-1);
}



//panel.getGraphics().fillRect(5, 100, 32, 32);

//check.keyPressed(Event);

panel.getGraphics().drawRect(18, 50, x2--, y2++);
	}

	
	
		
		
		}
	
	
			
		
	
	


