package chap_12;



import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class _04_MultiCatch {

	public static void main(String[] args) {
		

		
		FileReader fr = null;
		int character;
		try {
			fr = new FileReader("C:\\Users\\user\\Desktop\\MetaVerse\\eclipse\\project\\EclipseProject\\src\\chap_12\\input.txt");
			while ((character = fr.read()) != -1) {
			System.out.print((char) character);
		} 
	} catch(FileNotFoundException e) {
		System.out.println("Not found:" + e.getMessage());
	} catch(IOException e) {
		System.out.println("IO error:" +e.getMessage());
	} finally {
		if (fr != null) {
			try {
				fr.close();
			} catch(IOException e) {
				System.out.println("Err : closing " + e.getMessage());
			}
		}
    }
		
	

}
}
