package net.gfx;

import java.awt.AWTException;
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Menu;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.Writer;
import java.net.URL;
import java.nio.file.Path;
import java.sql.Time;
import java.util.TimeZone;
import java.util.Random;
import javax.imageio.ImageIO;
import javax.imageio.stream.ImageOutputStream;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.RepaintManager;
import javax.swing.WindowConstants;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.commons.configuration2.ex.ConfigurationException;
import org.apache.logging.log4j.core.config.builder.impl.BuiltConfiguration;
import org.apache.logging.log4j.core.util.SystemClock;
import org.xml.sax.SAXException;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonWriter;



public class Main implements KeyListener {
	public static Rectangle rect = new Rectangle(0,0,32,32);
private static final int Y3 = 0;
public static javax.swing.JLabel labX = new javax.swing.JLabel();
public static javax.swing.JLabel labY = new javax.swing.JLabel();
	public static javax.swing.JFrame frame = new JFrame("Undefined");
	public static javax.swing.JFrame frame2 = new JFrame("");
	public static File te2 = new File("G:/t.png");
public static Image img;
public static ImageObserver observer;
private static KeyEvent Event;
private static Polygon p;
private static String str1;
private static String str2;
public static File gfx = new File("src"
		+ "//res//Untitled32X32.png");
public static RepaintManager repaint = new RepaintManager();
public static net.gfx.Utils t = new net.gfx.Utils();
public static Path path ;
public static int x;
public static int x2;
public static int y2;
public static int y;
public static javax.swing.JPanel panel = new JPanel();
public static javax.swing.JPanel panel2 = new JPanel();
public static InputStream stream;
public static Boolean gameloop;
public static BufferedImage buff;
public static 	Image tes32;
private static URL url;
public static java.awt.Canvas canvas = new Canvas();
public static java.awt.Graphics gfxt;
public static Graphics2D g2 = (Graphics2D)canvas.getGraphics();
net.gfx.KeyCheck check = new net.gfx.KeyCheck();
public static int x3;
public static int y3;
public static int X3;
public static int Y31;

	@SuppressWarnings("unused")
	public static void main(String[] args) throws AWTException, IOException, ParserConfigurationException, SAXException, InterruptedException  {
		// TODO Auto-generated method stub
		
		if(System.getProperty("os.name") == "linux") {
			org.apache.logging.log4j.LogManager.getLogger().fatal("Linux Is Not Supported Beacuse Of File Paths");
			System.exit(0);
		}
		if(System.getProperty("os.name") == "Mac OS ") {
			org.apache.logging.log4j.LogManager.getLogger().fatal("Mac Is Not Supported Beacuse Of File Paths");
			System.exit(0);
		}
	
		
		
	
		

frame.setSize(800, 600);
frame.setVisible(true);
frame.setAutoRequestFocus(true);
frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
frame.setResizable(false);
frame.add(canvas);

canvas.addKeyListener(new Main());
canvas.setVisible(true);
canvas.setSize(640, 480);


//test2.create(0, 0, 640, 480);
File text = new File("G:\\FamiTracker-v0.4.6\\Demo\\FDS.wav");

//URL te2 = t.readFromInputStream(("/res/Untitled32X32.png"));
//te2.openStream();
String[] MusicList = new String[3];
MusicList[0] = "G:/res/FDS.wav";
MusicList[1] = "G:/res/FDS2.wav";
MusicList[2] = "G:/res/test.wav";
//org.apache.logging.log4j.LogManager.getLogger().debug(opt.has(opt.toString()));
//org.apache.logging.log4j.LogManager.getLogger().debug(t.readFromInputStream("G:\\FamiTracker-v0.4.6\\Demo\\FDS.wav").toString());




try {

	net.gfx.Test te = new net.gfx.Test();
	

	//frame.addKeyListener(new Main());

	x = t.RNGgen(255);
	y = t.RNGgen(255);
	
	try {
		
		url = net.gfx.Main.class.getResource(MusicList[1]);
		t.Play(new File(MusicList[1]), -1);
		
	} catch (LineUnavailableException | IOException | UnsupportedAudioFileException e1) {
		// TODO Auto-generated catch block
		
		org.apache.logging.log4j.LogManager.getLogger().fatal("A Fatal Error Has Occurred:" + "" + e1);
	}
	
	

	//org.apache.logging.log4j.LogManager.getLogger().debug(test2);
	java.awt.Robot ro = new Robot();

	BufferedImage im = ro.createScreenCapture(new Rectangle(frame.getBounds()));
ImageIO.write(im, "png",new File("G:/test.png"));
	

		//t.Read2(stream);
 String[] array = new String[3];
array[0] = "Test String ";
array[1] = "This Was Programmed By One Person";
array[2] =  "It Uses Libraries From Apatche,Google,w3c";

//frame.getGraphics().drawString("test", x, y);
		
canvas.getGraphics().draw3DRect(x, y, 32, 32, true);	

		//t.Download(t.Parse(args), new File("test.wav"));
		t.Stop();
		t.Play(new File("G:/test.wav"), -1);
		//frame.getGraphics().drawString("" + "W:" + "32" ,x,y);
		//frame.setFocusable(true);
		//panel.getGraphics().setPaintMode();
		
		
		//g2.draw(rect);
		//g2.fill(rect);
		gameloop = true;
			
		while(gameloop) {
						
			
			//labY.setText("Y Pos:" + "  " + y3);
			String x32 = String.valueOf(x3);
			String y32 = String.valueOf(y3);
			//org.apache.logging.log4j.LogManager.getLogger().fatal("Mac Is Not Supported Beacuse Of File Paths");
		t.labx.setText("Error:" + "  " + "Textreader Failed To Initialize.");
			//t.SetText(x32,y32 );
			if(frame.isVisible() == false) {
				gameloop = false;
			}
			
	
	
		
		}




} catch (IOException e) {
	// TODO Auto-generated catch block
	//e.printStackTrace();
	org.apache.logging.log4j.LogManager.getLogger().fatal("A Fatal Error Has Occurred:" + "" + e);
	System.exit(-1);
} catch (LineUnavailableException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (UnsupportedAudioFileException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}



//canvas.getGraphics().fillRect(5, 100, 32, 32);

//check.keyPressed(Event);


//canvas.getGraphics().drawString("tes2t", x, y);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
				int test3 = e.getKeyCode();
		if(test3 == e.VK_A) {
		
			
		
			//canvas.revalidate();
			//t.Stop();
		
	
			//canvas.repaint();
			
			rect.setLocation(rect.x  + 2,rect.y);
		x++;
		

		//canvas.getGraphics().drawString("test", x, y);
		org.apache.logging.log4j.LogManager.getLogger().debug(rect.x);
		
	
		}
		if(test3 == e.VK_S) {
			
		}
		if(test3 == e.VK_D) {
			
			labX.setVisible(true);
			labY.setVisible(true);
			try {
				t.CreateDebugWindow(640, 480, true,"TextReader");
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				try {
					PrintStream tes = new PrintStream(new File("G:/TestGame/Error.log"));
					tes.append("                                                      ");
					tes.append( "Class:"+ String.format("%s", this) + this.getClass().getName());
					e1.printStackTrace(tes);
				} catch (FileNotFoundException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				
			}
			//t.CreateGui(frame2,labY, 320, 200, true, "test", test3, test3);
			
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	
	
		
		
		}
	
	
			
		
	
	


