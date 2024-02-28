package chap_12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class _06_BufferedReader {

	public static void main(String[] args) {
		try (FileReader fileReader = new FileReader("output.txt");
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			FileWriter fileWriter = new FileWriter("outputUpper.txt");
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
				String line;
					while ((line = bufferedReader.readLine()) != null) {
						String uppercaseLine = line.toUpperCase();
						bufferedWriter.write(uppercaseLine);
						bufferedWriter.newLine();
				}
		} catch (IOException e) {
			System.out.println("Oops: " + e.getMessage());
		}
	}

}
