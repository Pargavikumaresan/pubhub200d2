package test.model;

import com.model.Book;
import java.time.LocalDate;
public class TestModel {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book book = new Book();

		
		book.setIsbn(103);
		book.setTitle("Java");
		book.setAuthor("gfsd");
		book.setContent("exception");
		book.setPrice(450);	
		book.setStatus("draft");
		

		
		System.out.println(book);
	}


}
