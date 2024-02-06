package chap_04;

public class _07_switch {

	public static void main(String[] args) {
		int nLetters=0;
		 String name="Jane";
		 switch(name){
		      case "Jane": case "Sean": case "Alan": case "Paul":
		           nLetters = 4;
		           break;
		      case "Janet": case "Susan":
		           nLetters = 5;
		           break;
		      case "Maaike": case "Alison": case "Miriam":
		           nLetters = 6;
		           break;
		      default:
		           System.out.println("Unrecognized name: " + name);
		           nLetters = -1;
		           break;
		           
		          
		 }
		 System.out.println(nLetters);

	}

}
