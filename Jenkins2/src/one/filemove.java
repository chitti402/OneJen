package one;

import java.io.File;
import java.io.IOException;
//import java.nio.file.Files;

public class filemove {
//private static final CopyOption REPLACE_EXISTING = null;

public static void main(String[] arg) {
	File sourceFile = new File("E:\\today\\chitti.txt");
	File destinationFile = new File("E:\\usha\\chitti.txt");
	try {
		destinationFile.
		Files.copy(sourceFile.toPath(), destinationFile.toPath());
		System.out.println("File copy Successfull");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}
}
