package com.jhonny.lendoumtextocomfilescanner;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program_FileWriter_BufferedWriter {

	public static void main(String[] args) {
		
		String[] lines = new String[] { "Good morning", "Goog afternoom", "Good night"};
		
		String path = "c:\\sk-java\\out.txt";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}
