package com.veritis.library.service;
import java.util.Collections;
import java.util.List;

import com.veritis.library.domain.Book;


public class BookService {

  private static BookService bookDAL = new BookService();
	public BookService() {
		// TODO Auto-generated constructor stub
	}
  public List<Book> getAllBooks(){
      return Collections.EMPTY_LIST;
  }

  public Book getBook(String isbn){
      return null;
  }

  public String addBook(Book book){
      return book.getIsbn();
  }

  public String updateBook(Book book){
      return book.getIsbn();
  }

  public void getData(){
	  List<Book> list=getAllBooks();
	  for(Book book:list){
		  System.out.println("we are getting "+book.getIsbn());
	  }
  }
  public static BookService getInstance(){
      return bookDAL;
  }
}