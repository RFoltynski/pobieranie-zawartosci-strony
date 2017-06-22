package pl.lodz.uni;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class Class1 {
	
	public String getHttpData (String url) throws IOException{
		
		URL http = new URL(url);
		InputStream stream = http.openStream();
		InputStreamReader reader = new InputStreamReader(stream);
		BufferedReader buffered = new BufferedReader(reader);
		
		String linia = null;
		StringBuilder builder = new StringBuilder();
		
		while ((linia = buffered.readLine()) != null)
		{
			builder.append(linia);
		}
		
		stream.close();
		
		return builder.toString();
		
	}
			
}
	
 
