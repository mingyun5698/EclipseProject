package chap_09.protected2;
import chap_09.protected1.Book;

public class Book2 extends Book {
	void read1() {
		Book b1 = new Book();
		// b1.read() 다른패키지여서 안됨
		read();
		this.read();
		Book2 b2 = new Book2();
		b2.read();
		super.read();;
		super.read();
	}
}
