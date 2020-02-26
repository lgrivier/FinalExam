package edu.hfcc.a;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;

import edu.hfcc.a.PathCreator;

public class WriteFile {

public void writeStringToFile(String outputString) {
		
		Path file = new PathCreator().createPathToFile("SubOutput.txt", "output");
		
		byte[] data = outputString.getBytes();
		OutputStream output = null;
		
		try {
			output = new BufferedOutputStream(Files.newOutputStream(file));
			output.write(data);
			output.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				output.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
}
