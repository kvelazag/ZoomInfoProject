package configuration_reader.org;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
	Properties p = new Properties();
	
	public ConfigurationReader() throws IOException, FileNotFoundException {
		
		File f = new File("C:\\Users\\kvela\\Downloads\\ZoomInfo\\ZoomInfo\\zoominfoproject\\Configuration\\config.properties");
		
		FileInputStream fis = new FileInputStream(f);
		
		p.load(fis);
		
	}
	
	public String getUrl() {
		
		String url = p.getProperty("url");
		
		return url;
		
	}
	public String getNewUrl() {
		String newUrl = p.getProperty("newUrl");
		
		return newUrl;
		
	}
	public String getwrongEmail() {
		String wrongEmail = p.getProperty("wrongEmail");
		return wrongEmail;
	}
	
	public String getcorrectEmail() {
		String correctEmail = p.getProperty("correctEmail");
		return correctEmail;
		
	}
}
