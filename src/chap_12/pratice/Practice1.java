package chap_12.pratice;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Practice1 {
	Dinasaur[] dino = new Dinasaur[5];
	
	public static void main(String[] args) {
		Practice1 management = new Practice1();
		management.addDino();
		management.makeFile();
		management.readFile();
		
		
		
	}
	
	
	void addDino() {
		dino[0] = new Dinasaur("티라노사우루스", 7500, 18);
		dino[1] = new Dinasaur("스테고사우루스", 11500, 22);
		dino[2] = new Dinasaur("브라키오사우루스", 105500, 33);
		dino[3] = new Dinasaur("모사사우루스", 56500, 46);
		dino[4] = new Dinasaur("랩터", 500, 27);
	}
	
	void makeFile() {
		try {
			FileWriter writer = new FileWriter("Dinasaur.txt");
			for (int i=0; i<dino.length; i++) {
				writer.write(dino[i].species + " " + dino[i].weight + "kg " + dino[i].age + "살 // ");
			}
			writer.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	void readFile() {
		try {
			FileReader fr = new FileReader("Dinasaur.txt");
			int character;
			while((character=fr.read()) != -1) {
				System.out.print((char)character);
			} fr.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
