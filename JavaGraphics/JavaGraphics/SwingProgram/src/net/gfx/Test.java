package net.gfx;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class Test  {
public static String input;
public URL readFromInputStream(File file) throws IOException {
URL url = this.getClass().getResource("/res/Untitled32X32.png");
return url;
}


}
