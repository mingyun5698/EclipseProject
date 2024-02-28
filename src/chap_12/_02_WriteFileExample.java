package chap_12;
import java.io.FileWriter;
import java.io.IOException;

public class _02_WriteFileExample {

	public static void main(String[] args) {
		try {
			FileWriter writer = new
			FileWriter("output.txt");
			writer.write("content");
			writer.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}
