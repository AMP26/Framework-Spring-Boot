package com.springboot.crud;

import com.springboot.crud.dao.BookDAO;
import com.springboot.crud.entity.Book;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;
import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class CrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(BookDAO bookDAO) {
		return runner -> {
			Scanner scanner = new Scanner(System.in);

			System.out.println("Options:");
			System.out.println("1 - Add Single Book");
			System.out.println("2 - Add Multiple Books");
			System.out.println("3 - Find By ID");
			System.out.println("4 - Find All Books");
			System.out.println("5 - Find By Author Name Sorted");
			System.out.println("6 - Find By Author Name");
			System.out.println("7 - Update Author Name By ID");
			System.out.println("8 - Delete A Book By ID");
			System.out.println("9 - Delete All Books");
			System.out.print("Choose Action: ");

			int input = scanner.nextInt();

			switch (input) {
				case 1:
					newBook(bookDAO); // C - Create
					break;
				case 2:
					multipleNewBooks(bookDAO); // C - Create
					break;
				case 3:
					findBook(bookDAO); // R - Read
					break;
				case 4:
					findAllBooks(bookDAO); // R - Read
					break;
				case 5:
					findByAuthorNameSorted(bookDAO); // R - Read
					break;
				case 6:
					findByAuthor(bookDAO); // R - Read
					break;
				case 7:
					updateAuthorById(bookDAO); // U - Update
					break;
				case 8:
					deleteBook(bookDAO); // D - Delete
					break;
				case 9:
					deleteAllBooks(bookDAO); // D - Delete
					break;
				default:
					System.out.println("Invalid option. Please enter a valid option between.");
			}

			scanner.close();
		};
	}

	private void newBook(BookDAO bookDAO) {
		System.out.println("Creating A New Book!");
		Book book = new Book("The Silent Forest", "Olivia Harper", "978-0-123456-00-1", new BigDecimal("299"));

		System.out.println("Saving the created Book!");
		bookDAO.save(book);

		System.out.println("Book saved with ID: " + book.getId());
	}

	private void multipleNewBooks(BookDAO bookDAO) {
		System.out.println("Creating Multiple Books!");

		Book book1 = new Book("Beyond the Horizon", "Liam Anderson", "978-0-123456-01-8", new BigDecimal("399"));
		Book book2 = new Book("Tales from the Attic", "Sophia Bennett", "978-0-123456-02-5", new BigDecimal("249"));
		Book book3 = new Book("Whispers in the Wind", "Ethan Carter", "978-0-123456-03-2", new BigDecimal("350"));
		Book book4 = new Book("A Cup of Autumn", "Ava Thompson", "978-0-123456-04-9", new BigDecimal("275"));

		System.out.println("Saving Books!");
		bookDAO.save(book1);
		bookDAO.save(book2);
		bookDAO.save(book3);
		bookDAO.save(book4);

		System.out.println("Books saved with IDs:");
		System.out.println(book1.getId());
		System.out.println(book2.getId());
		System.out.println(book3.getId());
		System.out.println(book4.getId());
	}

	private void findBook(BookDAO bookDAO) {
		// Object Creation
		System.out.println("Creating a new Book");
		Book book = new Book("Shadows of the Past", "Noah Mitchell", "978-0-123456-05-6", new BigDecimal("370"));

		// Saving Object
		System.out.println("Saving the created Book!");
		bookDAO.save(book);

		// Getting ID of the Book
		int id = book.getId();
		System.out.println("ID of the newly created Book: " + id);

		// Retrieving Book by ID
		System.out.println("Retrieving Book by ID!");
		Book myBook = bookDAO.findById(id);

		// Display
		System.out.println("Book Found: " + myBook);
	}

	private void findAllBooks(BookDAO bookDAO) {
		// Get Books
		List<Book> allBooks = bookDAO.findAll();

		// Display
		for (Book book : allBooks) {
			System.out.println(book);
		}
	}

	private void findByAuthorNameSorted(BookDAO bookDAO) {
		// Get Books
		List<Book> allBooks = bookDAO.findByAuthorSorted();

		// Display
		for (Book book : allBooks) { System.out.println(book); }
	}

	private void findByAuthor(BookDAO bookDAO) {
		// Get Books By Authors
		List<Book> booksByAuthor = bookDAO.findByAuthor("Olivia Harper");

		// Display
		for(Book book : booksByAuthor) { System.out.println(book); }
	}

	private void updateAuthorById(BookDAO bookDAO) {
		int bookId = 2;
		// Get Book By ID
		System.out.println("Getting Book of ID: " + bookId);
		Book theBook = bookDAO.findById(bookId);

		// Change Author Name
		System.out.println("Updating Author Name!");
		theBook.setAuthor("James William");

		// Update
		bookDAO.updateAuthorName(theBook);
		System.out.println("Author Name Updated!");

		// Display
		System.out.println(theBook);
	}

	private void deleteBook(BookDAO bookDAO) {
		Integer bookId = 3;
		// Deleting Book
		System.out.println("Deleting Book of ID: " + bookId);
		bookDAO.delete(bookId);
	}

	private void deleteAllBooks(BookDAO bookDAO) {
		System.out.println("Deleting All Books!");
		int rowsDeleted = bookDAO.deleteAll();
		System.out.println("Number of Rows Deleted: " + rowsDeleted);
	}
}
