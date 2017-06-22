package pl.lodz.uni;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
	public void write(String name, String data) throws IOException{
		FileWriter writer = new FileWriter(name);
		writer.write(data);
		writer.flush();
		writer.close();
		
	}
}
