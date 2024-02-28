package chap_12;
import java.io.FileReader;
import java.io.IOException;

public class _01_ReadFildExample {

	public static void main(String[] args) {
		try {
			FileReader reader = new FileReader("C:\\Users\\user\\Desktop\\MetaVerse\\eclipse\\project\\EclipseProject\\src\\chap_12\\input.txt");
			int character;
			
			while((character= reader.read()) != -1) {
				System.out.println((char) character);
			}
			
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
