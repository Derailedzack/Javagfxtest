package net.gfx;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.CharBuffer;
import java.nio.file.Files;
import java.util.Random;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Utils {
	public static String t;
	private static  Clip wave;
	public int n;
	public static String Text;
	
	
	

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
}

