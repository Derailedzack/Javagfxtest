package net.gfx;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.CharBuffer;
import java.nio.file.Files;
import java.nio.file.Path;

public class TextReader {
	public static String Text;
	public static String Textout;
	
	public static CharBuffer cbuf;
	public static CharBuffer cbuf2;
	public static int t;
public static String Read(File file) throws IOException {


	Text = new String(Files.readAllBytes(file.toPath()));
		
	return Text;
}
}
