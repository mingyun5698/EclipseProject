package chap_12;
import java.io.FileReader;
import java.io.IOException;


public class _05_tryWithResources {

	public static void main(String[] args) {
		try (FileReader fileReader = new FileReader("output.txt")) {
			int character;
			StringBuilder content = new StringBuilder();
			  while ((character = fileReader.read()) != -1) {
				 content.append((char) character);
			 } System.out.println(content.toString());
		} catch (IOException e) {
			System.out.println("Oops: " + e.getMessage());
		  }
	}

}
