package chap_13;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class _03_File {
	 public static void usingFile() {
		 try(Scanner sc = new Scanner(new File(System.getProperty("user.dir") + "\\sample.txt"));) {
			 if(sc.hasNextInt()) {
                 int age = sc.nextInt();
                 System.out.println(age);
            } 
		 } catch (FileNotFoundException fnfe) {
             fnfe.printStackTrace();
   } 
	 }
	 
	 public static void main(String[] args) {
		 usingFile();
	 }
}

