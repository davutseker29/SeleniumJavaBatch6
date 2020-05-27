package com.syntax.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Practice {

	public static void main(String[] args) {
		
		String path=System.getProperty("user.dir")+"/configs/configuration.properties";
		
		try {
			FileInputStream fis=new FileInputStream(path);
			
			Properties prop=new Properties();
			prop.load(fis);
			
			System.out.println(prop.get("url"));
			
//			fis.close();
		} catch (FileNotFoundException e) {
						e.printStackTrace();
		} catch (IOException e) {
					e.printStackTrace();
		}
		
	
	

	}

}
