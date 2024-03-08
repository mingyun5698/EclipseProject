package javaExam02;

public abstract class LibraryItem {
	String title;
	String UPC;
	String subject;
	
	public abstract String toString();
	
	abstract void locate();
	
	LibraryItem(String subject, String title, String UPC) {
		this.title = title;
		this.UPC = UPC;
		this.subject = subject;
	}
	
	
	
}

class Book extends LibraryItem {
	
	
	

	

	String ISNB;
	String DDSnumber;

	
	Book(String subject, String title ,String UPC, String ISNB, String DDSnumber) {
		super(title, UPC, subject);
		this.ISNB = ISNB;
		this.DDSnumber = DDSnumber;

		
		
		
		
	}
	
	@Override
	public String toString() {
		return "Book::toSring";
	}

	@Override
	void locate() {
		System.out.println("주제 : " + this.subject);
	}
	
}

class CD extends LibraryItem {

	@Override
	public String toString() {
		return "CD::toString";
	}

	@Override
	void locate() {
	}
	
}

class DVD extends LibraryItem {

	
	
	@Override
	public String toString() {
		return "DVD::toSring";
	}

	@Override
	void locate() {
	}
	
}

class Magazine extends LibraryItem {

	
	String volume;
	String issue;
	
	@Override
	public String toString() {
		return "Magazine::toSring";
	}

	@Override
	void locate() {
	}
	
}
