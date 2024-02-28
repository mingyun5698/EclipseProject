package chap_12.pratice;
import java.io.FileReader;
import java.io.IOException;


public class Practice4 {

	public static void main(String[] args) {
		try(FileReader fr = new FileReader("DinoDiet.txt")) {
			int a;
			while((a=fr.read()) != -1) {
				System.out.print((char)a);
			}
		} catch(IOException e) {
			System.out.println(e.getMessage());
		}
	} 

}
