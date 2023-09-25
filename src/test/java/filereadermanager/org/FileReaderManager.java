package filereadermanager.org;

import java.io.IOException;

import configuration_reader.org.ConfigurationReader;

public class FileReaderManager {
	
	private FileReaderManager() {
		
		//Restrict the object creation
		
	}
	
	public static FileReaderManager getInstanceFR() {
		
		FileReaderManager fr = new FileReaderManager();
		return fr;
	}
	
	public ConfigurationReader getInstanceCR() throws IOException {
		
		ConfigurationReader cr = new ConfigurationReader();
		return cr;
	}
}
