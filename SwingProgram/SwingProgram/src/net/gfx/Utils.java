package net.gfx;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.ScrollPane;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.CharBuffer;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.Random;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.commons.io.FileUtils;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonWriter;



public class Utils {
	public static String t;
	private static  Clip wave;
	public int n;
	public static String Text;
	public static com.google.gson.Gson json2 = new GsonBuilder().create();
public static javax.swing.JLabel labx = new JLabel();
public static javax.swing.JLabel laby = new JLabel();
public static javax.swing.JFrame frame = new JFrame("test");


public URL readFromInputStream(String string) {
	// TODO Auto-generated method stub
	URL url = this.getClass().getClassLoader().getResource(string);
	return url;
	
}
public InputStream readFromInputStream2(String string) {
	// TODO Auto-generated method stub
	InputStream in = this.getClass().getClassLoader().getResourceAsStream(string);
	return in;
}
public int RNGgen(int i) {
	// TODO Auto-generated method stub
	Random Rn = new Random();
	n = Rn.nextInt(i);
	return n;
}

public void PlayInputStream(InputStream in,int Loop) throws LineUnavailableException, IOException, UnsupportedAudioFileException {
	// TODO Auto-generated method stub
	wave = AudioSystem.getClip();
	wave.open(AudioSystem.getAudioInputStream(in));
	
	wave.start();
	wave.loop(Loop);
	
}

public void Play(File file,int Loop) throws LineUnavailableException, IOException, UnsupportedAudioFileException {
	// TODO Auto-generated method stub
	wave = AudioSystem.getClip();
	wave.open(AudioSystem.getAudioInputStream(file));
	 
	wave.start();
	wave.loop(Loop);
	
	
}
public static String Read(File file) throws IOException {


	Text = new String(Files.readAllBytes(file.toPath()));
		
	return Text;
}
public static void CreateGui(JFrame frame,javax.swing.JComponent comp,int w,int h,boolean v,String Title,int x,int y) {
	frame.setSize(w,h);
	frame.setVisible(v);
	frame.setTitle(Title);
	frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	frame.setResizable(false);
	frame.add(comp);
	frame.setLocation(x, y);
	
}public static void CreateGuiM(JFrame frame,javax.swing.JComponent comp,int w,int h,boolean v,String Title,int x,int y,javax.swing.JComponent comp2,int x2,int y2,int x3,int y3) {
	frame.setSize(w,h);
	frame.setVisible(v);
	frame.setTitle(Title);
	frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	frame.setResizable(false);
	frame.add(comp);
	frame.setLocation(x, y);
	
	
}
public static void CreateDebugWindow(int w,int h,boolean v,String Mode) throws IOException {
	if(Mode == "TextReader") {
		JTextArea area = new JTextArea();
		JScrollPane pane = new JScrollPane(area);
		//pane.setViewportView();
		//laby.setLocation(-10,-2);
	//GridLayout grid = new GridLayout(2,-40000,-299,-299);
		frame.add(pane);
	    //frame.setLayout(grid);
		frame.setVisible(true);
		frame.setSize(w, h);
		labx.setVisible(v);
		//frame.add(labx);
		//frame.add(area);
		
		//pane.add(area);
		pane.setVisible(true);
		pane.setHorizontalScrollBarPolicy(pane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		pane.setVerticalScrollBarPolicy(pane.VERTICAL_SCROLLBAR_AS_NEEDED);
		area.setEditable(false);
		area.setWrapStyleWord(true);
		area.setText(Read(new File("z:\\SDL2-devel-2.0.8-VC\\love-0.8.0-win-x64\\love-0.8.0-win-x64\\mari0_1.6.love")));
		
		labx.setLocation(21,0);
		//frame.add(laby);
		//laby.setVisible(v);
	}
	if(Mode == "Base") {
		//JTextArea area = new JTextArea();
		//JScrollPane pane = new JScrollPane(area);
		//pane.setViewportView();
		//laby.setLocation(-10,-2);
	//GridLayout grid = new GridLayout(2,-40000,-299,-299);
		//frame.add(pane);
	    //frame.setLayout(grid);
		frame.setVisible(true);
		frame.setSize(w, h);
		labx.setVisible(v);
		//frame.add(labx);
		//frame.add(area);
		
		//pane.add(area);
		//pane.setVisible(true);
		//pane.setHorizontalScrollBarPolicy(pane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		//pane.setVerticalScrollBarPolicy(pane.VERTICAL_SCROLLBAR_AS_NEEDED);
		//area.setEditable(false);
		//area.setWrapStyleWord(true);
		//area.setText(Read(new File("G:\\SDL2-devel-2.0.8-VC\\love-0.8.0-win-x64\\love-0.8.0-win-x64\\mari0_1.6.love")));
		
		labx.setLocation(21,0);
		//frame.add(laby);
		//laby.setVisible(v);
		
		//frame.setLayout(null);
	}
	
}
public static void Read2(InputStream in) throws IOException {
	
	
	FileWriter writer = new FileWriter(new File("G:/test2.json"));
	JsonWriter json = new JsonWriter(writer);
	json.beginObject();
	//String test2 = json2.fromJson(opt.valueOf("LoadGFX").toString(),String.class);
json.endObject();
	
	json2.toJson(in.toString(), writer);
	writer.close();
	json.close();

}
public static void Download(String url,File dest) throws ParserConfigurationException, SAXException, IOException {
	URL test = new URL(url);
	org.apache.logging.log4j.LogManager.getLogger().debug(test.getContent());
	FileUtils.copyURLToFile(test, dest,60,60);
	
}
public static String Parse(String[] arg) {
	String str = Arrays.toString(arg);
	str = str.substring(1, str.length()-1).replace("[]", "");
	//arg2.replaceAll("[]", "");
	return str;
	
}
public static void SetText(String x,String y) {
	labx.setText(x);
	laby.setText(y);
}
public static void Stop() {
	
	wave.stop();
	wave.close();
}
public static void DisplayErrorMessage(java.lang.Exception e,int w,int h) {
	StringWriter sb = new StringWriter();
	sb.append("Error: ");
	e.printStackTrace(new PrintWriter(sb));
	
	String Ioexecptionstring = sb.toString();
	JFrame frame = new JFrame("");
	frame.pack();
	frame.setLocationRelativeTo(null);
	frame.setVisible(false);
	JTextArea text = new JTextArea(w,h);
	text.setEditable(false);
	text.setText(Ioexecptionstring);
	JScrollPane pane = new JScrollPane(text);
	
	JOptionPane.showMessageDialog(frame,pane,"Error", JOptionPane.ERROR_MESSAGE);
}
}

