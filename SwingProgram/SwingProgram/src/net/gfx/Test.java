package net.gfx;

import java.io.File;

import org.apache.commons.configuration2.Configuration;
import org.apache.commons.configuration2.FileBasedConfiguration;
import org.apache.commons.configuration2.builder.BuilderParameters;
import org.apache.commons.configuration2.builder.fluent.Parameters;
import org.apache.commons.configuration2.ex.ConfigurationException;
import org.apache.commons.configuration2.io.FileHandler;

public class Test {
public static org.apache.commons.configuration2.ImmutableConfiguration t;

public static FileHandler handler;
public static net.gfx.Utils util;
private static Parameters params;
public static File config = new File("G:\\Test\\config.txt");
public static void test() throws ConfigurationException {

	
	org.apache.commons.configuration2.builder.FileBasedConfigurationBuilder<FileBasedConfiguration>  filebased = new org.apache.commons.configuration2.builder.FileBasedConfigurationBuilder<org.apache.commons.configuration2.FileBasedConfiguration>(org.apache.commons.configuration2.PropertiesConfiguration.class).configure(params.fileBased().setFile(config));
	try {
		Configuration conf = filebased.getConfiguration();
	}
	catch(ConfigurationException e) {
		org.apache.logging.log4j.LogManager.getLogger().catching(e);
	}
	
	 
	
	
}

}
