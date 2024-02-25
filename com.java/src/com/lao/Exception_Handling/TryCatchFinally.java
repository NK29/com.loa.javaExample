package com.lao.Exception_Handling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryCatchFinally {
	
	static String filename = "ReadMe.txt";
	static BufferedReader br = null;
	static FileReader fr = null;

	public static void main(String[] args) {
		
		try {
			fr = new FileReader(filename);
			br = new BufferedReader(fr);
			
			String sCurrentLine;
			
			while ((sCurrentLine = br.readLine()) != null) {
				System.out.println(sCurrentLine);
			}
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if (br != null)
					br.close();
				if (fr != null)
					fr.close();
			}catch (IOException ex) {
				ex.printStackTrace();
			}
         }
	}
}
