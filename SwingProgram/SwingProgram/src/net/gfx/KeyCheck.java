package net.gfx;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.tools.JavaCompiler;

import org.apache.logging.log4j.*;

public class KeyCheck implements KeyListener {

public void keyPressed(KeyEvent e) {
	int code = e.getKeyCode();
	if(e.getKeyCode() == e.VK_0) {
		org.apache.logging.log4j.LogManager.getLogger().debug("test23");
		
	}
}

@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	
}

	
	
	
}
