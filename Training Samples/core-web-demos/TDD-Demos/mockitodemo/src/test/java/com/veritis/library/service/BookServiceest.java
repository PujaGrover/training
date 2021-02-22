package com.veritis.library.service;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.veritis.library.domain.Book;

@RunWith(MockitoJUnitRunner.class) 

public class BookServiceest {

  private static BookService mockedBookService;

  private static Book book1;

  private static Book book2;

  @BeforeClass
  public static void setUp(){
	  mockedBookService= Mockito.mock(BookService.class);
    book1 = new Book("8131721019","Compilers Principles",
            Arrays.asList("D. Jeffrey Ulman","Ravi Sethi", "Alfred V. Aho", "Monica S. Lam"),
            "Pearson Education Singapore Pte Ltd", 2008,1009,"BOOK_IMAGE");

    book2 = new Book("9788183331630","Let Us C 13th Edition",
            Arrays.asList("Yashavant Kanetkar"),"BPB PUBLICATIONS", 2012,675,"BOOK_IMAGE");

    when(mockedBookService.getAllBooks()).thenReturn(Arrays.asList(book1, book2));
    when(mockedBookService.getBook("8131721019")).thenReturn(book1);
    when(mockedBookService.addBook(book1)).thenReturn(book1.getIsbn());

    when(mockedBookService.updateBook(book1)).thenReturn(book1.getIsbn());

  }

  @Test
  public void testGetAllBooks() throws Exception {

    List<Book> allBooks = mockedBookService.getAllBooks();
    assertEquals(2, allBooks.size());
    Book myBook = allBooks.get(0);
    assertEquals("8131721019", myBook.getIsbn());
    assertEquals("Compilers Principles", myBook.getTitle());
    assertEquals(4, myBook.getAuthors().size());
    assertEquals((Integer)2008, myBook.getYearOfPublication());
    assertEquals((Integer) 1009, myBook.getNumberOfPages());
    assertEquals("Pearson Education Singapore Pte Ltd", myBook.getPublication());
    assertEquals("BOOK_IMAGE", myBook.getImage());
  }

  @Test
  public void testGetBook(){

    String isbn = "8131721019";

    Book myBook = mockedBookService.getBook(isbn);

    assertNotNull(myBook);
    assertEquals(isbn, myBook.getIsbn());
    assertEquals("Compilers Principles", myBook.getTitle());
    assertEquals(4, myBook.getAuthors().size());
    assertEquals("Pearson Education Singapore Pte Ltd", myBook.getPublication());
    assertEquals((Integer)2008, myBook.getYearOfPublication());
    assertEquals((Integer)1009, myBook.getNumberOfPages());

  }

  @Test
  public void testNotExistGetBook(){

    String isbn = "8131721020";

    Book myBook = mockedBookService.getBook(isbn);

    assertNull(myBook);
   

  }

  
  @Test
  public void testAddBookExist(){
    String isbn = mockedBookService.addBook(book1);
    assertNotNull(isbn);
    assertEquals(book1.getIsbn(), isbn);
  }
  @Test
  public void testAddBookNotExist(){
	  String isbn = mockedBookService.addBook(book2);
	    assertNull(isbn); 
  }

  @Test
  public void testUpdateBook(){

    String isbn = mockedBookService.updateBook(book1);
    assertNotNull(isbn);
    assertEquals(book1.getIsbn(), isbn);
  }
  
  @Test
  public void testGetData(){
	  mockedBookService.getData();
  }
}