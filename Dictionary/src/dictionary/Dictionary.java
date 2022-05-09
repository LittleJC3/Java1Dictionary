/*
 * Reads a file and prints the contents of the Dictionary
 */
package dictionary;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Dictionary {

	public static void main(String[] args) {
		ArrayList<String> words = new ArrayList<String>(); // Declare and instantiate
		// Open words file and read all of it into words ArrayList
		try {
			FileReader myFileReader = new FileReader("English.txt");
			BufferedReader myBufferedReader = new BufferedReader(myFileReader);
			String data;
			while (true) {
				data = myBufferedReader.readLine();
				if (data == null) {
					break;
				}
				words.add(data);
			}
			System.out.println(words.size() + " words read");
			myBufferedReader.close();
			// Print the first and last items in the ArrayList
			System.out.println(words.get(0));
			System.out.println(words.get(words.size() - 1));
		} catch (FileNotFoundException ex) {
			System.err.println("File not found Exception: " + ex.getLocalizedMessage());
		} catch (IOException ex) {
			System.err.println("IO Exception: " + ex.getLocalizedMessage());
		} catch (ArithmeticException ex) {
			System.err.println("Arithmetic: " + ex.getLocalizedMessage());
		}
	}
}
