package test.dao;

import java.time.LocalDate;

import com.dao.BookDao;
import com.model.Book;

public class TestBookDao {
	public static void main(String[] args) {
		Book book = new Book();
		book.setIsbn(97887006);
		book.setTitle("Harry2");
		book.setAuthor("JKrowdy");
		book.setPublishDate(LocalDate.parse("1990-12-01"));
		book.setContent("Harry");
		book.setPrice(1200);
		book.setStatus("published");
		
		BookDao bookdao = new BookDao();
		
		/* Author can create a book */
		try {
			bookdao.insertBook(book);
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		/* Author can upload the contents of book */
		try {
			bookdao.updateContent(book);
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		/* Author can view the book and contents */
		try {
			bookdao.viewBook(book);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		/* Author can delete the book */
		try {
			bookdao.deleteBook(book);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		/* Author can view all his books */
		try {
			bookdao.viewAllBooks(book);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


}
