package com.jhonny.lendoumtextocomfilescanner;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ProgramFileWriterBufferedWriterExrevendodados {

	public static void main(String[] args) {
		
		String[] lines = new String[] { "Good morning", "Goog afternoom", "Good night"};
		
		String path = "c:\\sk-java\\out.txt";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
			for (String line : lines) { 
				bw.write(line); 
				bw.newLine();
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		File file = new File("c:\\sk-java\\out.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} 
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} 
		finally {
			if (sc != null) { 
				sc.close() ;

			}
		}
	}

}
