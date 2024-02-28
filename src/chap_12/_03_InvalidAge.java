package chap_12;


class InvaildAgeException extends Exception {
	InvaildAgeException() {
		super();
	}
	
	InvaildAgeException(String massage) {
		super(massage);
	}
	
	InvaildAgeException(Exception e) {
		super(e);
	}
	
	public String getMessage() {
		return "나이가 낮습니다.";
	}
	
	
}

public class _03_InvalidAge {
	private int age;
	
//	_03_InvalidAge(int age) {
//		this.age = age;
//	}
	
	public void setAge(int age) throws InvaildAgeException {
		if (age<0) throw new InvaildAgeException();
		this.age=age;
	}
	
	public static void main(String[] args) {
		_03_InvalidAge invalidAge = new _03_InvalidAge(); 
		
		
		
		try {
			invalidAge.setAge(-5);

		} catch(InvaildAgeException e) {
			System.out.println("나이가 낮습니다.");
			e.printStackTrace();
			System.out.println(e.getMessage());
			
		}
		
		
	}
	
	
	
}

