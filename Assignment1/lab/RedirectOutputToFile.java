package lab;

import java.io.File;
import java.io.PrintStream;
import java.io.FileOutputStream;

/**
 * Redirect output to a file
 */
public class RedirectOutputToFile {
	public static void main(String[] args) throws Exception {
		File f = new File(" myfile .txt ");
		FileOutputStream fs = new FileOutputStream(f);
		PrintStream ps = new PrintStream(fs);
		System.setOut(ps);
		System.out.println("good ");
		ps.close();
	}
}
