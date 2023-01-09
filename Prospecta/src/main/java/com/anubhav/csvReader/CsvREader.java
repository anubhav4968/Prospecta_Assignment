package com.anubhav.csvReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import io.micrometer.common.util.StringUtils;

public class CsvREader {

	public static void main(String[] args) {
		readCSV("D:\\CSV\\new.csv");
	}
	public static void readCSV(String file) {
		
		String line="";
		String declare=",";
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));
	        
				line = reader.readLine();
				
				while (!StringUtils.isEmpty(line)) {
					System.out.println("User data:"+line);
				} 
				
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
