package Utilities.Capgemini.Dlg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class EnvironmentalVariables {
	public Properties prop;
	public EnvironmentalVariables(){
		 prop=new Properties();
		try {
			InputStream input=new FileInputStream("./Resources/EnvironmentalVariables.properties");
			prop.load(input);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}

			