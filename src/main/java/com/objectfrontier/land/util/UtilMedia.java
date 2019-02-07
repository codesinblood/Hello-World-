package com.objectfrontier.land.util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class UtilMedia {
	
	public static void main(String[] args) throws IOException {
	
		FileReader fr = new FileReader("D://temp/test.txt");
		BufferedReader br = new BufferedReader(fr);
		FileWriter fw = new FileWriter("D://temp/test1.txt", true);
		String s;

		while ((s = br.readLine()) != null) { // read a line
			fw.write(s); // write to output file
			fw.flush();
		}
		br.close();
		fw.close();
                    System.out.println("file copied");
	
	}
}
