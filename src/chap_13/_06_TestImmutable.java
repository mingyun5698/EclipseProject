package chap_13;
import  java.util.ArrayList;
import java.util.List;

public class _06_TestImmutable {

	public static void main(String[] args) {
		List<String> animals  = new ArrayList<>();
        animals.add("Cattle");
        
        Farm farm = Farm.createNewInstance("Small Fram", 25, animals);
        System.out.println("Created: " + farm); 
        // Created: Farm{name=Small Farm, nunAnimals=25, aniamls={Cattle}
        
        String name = farm.getName();
        int numAnimals = farm.getNumAnimals();
        animals = farm.getAnimals();
        // animals는 리스트라서 변경이 된다 그래서 생성자랑 getter 를 짤때 잘 짜야한다.
        
        
        System.out.println("Retrieved: " + name + " " 
                + numAnimals + 
                " "+ animals);  // Retrieved: Small Farm 25 [Cattle]
        
        name = "Big Farm"; 
        numAnimals  = 500;
        animals.add("Sheep"); animals.add("Horses");
        
        // Any change?: Farm{name=Small Farm, numAnimals=25, animals=[Cattle, Sheep, Horses]}
        System.out.println("Any change?:  " + farm);


	}

}

final class Farm {
	   private final String name;         // String is immutable
	   private final int numAnimals;
	   private final List<String> animals;   //  mutable
	   
	   private Farm(final String name, final int numAnimals, final List<String> animals) {
		   this.name = name;
           this.numAnimals = numAnimals;
           this.animals = new ArrayList<String>(animals); // create a new ArrayList
//           this.animals = animals;// breaking encapsulation!

	   }
	   
	   public static Farm createNewInstance(String name, int numAnimals, List<String> animals) {
           return new Farm(name, numAnimals, animals);
       }
	   
	   public String getName() { return this.name; }
       public  int  getNumAnimals() { return this.numAnimals; }
       public List<String> getAnimals() {
    	 return new ArrayList<String>(animals);// return a new object
           //return animals;              // breaking encapsulation!
       }
       
       public String toString() {
           return "Farm{" + "name=" + name + ", numAnimals=" +
                          numAnimals + ", animals=" + animals + "}";
      }
}
    




