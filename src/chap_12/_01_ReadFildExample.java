package chap_12;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class _01_ReadFildExample {
	

	public static void main(String[] args) {
		
		char[] id = new char[100];
		int count=0;
		String ids = "";
		Scanner sc = new Scanner(System.in);
		
		try {
			FileReader reader = new FileReader("C:\\Users\\user\\Desktop\\MetaVerse\\eclipse\\project\\EclipseProject\\src\\chap_12\\input.txt");
			int character;
			
			while((character= reader.read()) != -1) {
				System.out.print((char) character);
				id[count] = (char)character;
				count++;
			}
			System.out.println("");
			
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		for (int i=0; i<count; i++) {
			ids += id[i];
		}
		
		System.out.print("id를 입력하세요 >>");
		String idc = sc.next();
		System.out.println(ids.equals(idc));
	}

}
