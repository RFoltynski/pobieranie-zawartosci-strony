package pl.lodz.uni;

import java.io.IOException;
import java.util.Scanner;


public class Project1 {

	public static void main(String[] args) {
		
		String s = null;
		Scanner scnr = new Scanner(System.in);
		WriteToFile writer = new WriteToFile();
		Class1 cl1 = new Class1();
		
		while(true)
		{
		try {
			System.out.println("Podaj nazwê  strony");
			String strona = scnr.nextLine();
			if (!strona.startsWith("http://")){
				strona="http://"+strona;
			}
			s=cl1.getHttpData(strona);
			writer.write(strona.replace("http://"," ")+ ".txt", s);
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		}
		
	}

}
